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
            post {
                failure {
                    script {
                        def prNumber = env.CHANGE_ID
                        if (prNumber) {
                            echo "Build failed on PR #${prNumber}, closing PR..."
                            def repo = 'Instulearn/UI'

                            withCredentials([string(credentialsId: 'github-full-token', variable: 'GITHUB_TOKEN')]) {
                                bat """
                                curl -X PATCH -H "Authorization: token %GITHUB_TOKEN%" ^
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

                    echo "Merging PR #${prNumber} via GitHub API..."

                    withCredentials([string(credentialsId: 'github-full-token', variable: 'GITHUB_TOKEN')]) {
                        bat """
                        curl -X PUT -H "Authorization: token %GITHUB_TOKEN%" ^
                             -H "Accept: application/vnd.github+json" ^
                             https://api.github.com/repos/${repo}/pulls/${prNumber}/merge ^
                             -d "{\\"commit_title\\": \\"Auto-merged by Jenkins\\", \\"merge_method\\": \\"squash\\"}"
                        """
                    }
                }
            }
        }
    }
}
