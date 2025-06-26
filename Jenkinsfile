pipeline {
    agent any

    environment {
        BRANCH_NAME = "${env.BRANCH_NAME ?: env.CHANGE_BRANCH ?: 'unknown'}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            when {
                expression { env.CHANGE_ID != null }
            }
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Cucumber Test') {
            when {
                expression { env.CHANGE_ID != null }
            }
            steps {
                script {
                    try {
                        bat 'mvn test -Dcucumber.options="--plugin pretty"'
                    } catch (Exception e) {
                        echo "❌ Cucumber test execution failed: ${e.getMessage()}"
                        currentBuild.result = 'FAILURE'
                        throw e
                    }
                }
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Allure Report') {
            when {
                expression { env.CHANGE_ID != null }
            }
            steps {
                allure includeProperties: false,
                       results: [[path: 'target/allure-results']]
            }
        }

        stage('Auto Merge PR') {
            when {
                allOf {
                    expression { env.BRANCH_NAME != 'main' }
                    expression { env.CHANGE_ID != null }
                }
            }
            steps {
                script {
                    def prNumber = env.CHANGE_ID
                    def repo = 'Instulearn/UI'

                    echo "🔀 Merging PR #${prNumber} via GitHub API..."

                    withCredentials([string(credentialsId: 'github_full_api_token', variable: 'GITHUB_TOKEN')]) {
                        bat """
                        curl --fail --silent --show-error -X PUT ^
                        -H "Authorization: token %GITHUB_TOKEN%" ^
                        -H "Accept: application/vnd.github+json" ^
                        https://api.github.com/repos/${repo}/pulls/${prNumber}/merge ^
                        -d "{\\"commit_title\\": \\"Auto-merged by Jenkins\\", \\"merge_method\\": \\"squash\\"}"
                        """
                    }
                }
            }
        }

        stage('Close PR on Test Fail') {
            when {
                expression { currentBuild.result == 'FAILURE' && env.CHANGE_ID != null }
            }
            steps {
                script {
                    def prNumber = env.CHANGE_ID
                    def repo = 'Instulearn/UI'
                    echo "🛑 Closing failed PR #${prNumber}..."

                    withCredentials([string(credentialsId: 'github_full_api_token', variable: 'GITHUB_TOKEN')]) {
                        bat """
                        curl --fail --silent --show-error -X PATCH ^
                        -H "Authorization: token %GITHUB_TOKEN%" ^
                        -H "Accept: application/vnd.github+json" ^
                        https://api.github.com/repos/${repo}/pulls/${prNumber} ^
                        -d "{\\"state\\":\\"closed\\"}"
                        """
                    }
                }
            }
        }
    }
}