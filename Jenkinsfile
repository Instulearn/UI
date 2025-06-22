pipeline {
    agent any

    environment {
        BRANCH_NAME = "${env.GIT_BRANCH?.replaceFirst('origin/', '')}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Check PR') {
            when {
                expression { env.CHANGE_ID == null }
            }
            steps {
                error("No Pull Request detected, stopping pipeline.")
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
                            def token = credentials('github-token')

                            bat """
                            curl -X PATCH -H "Authorization: token ${token}" ^
                                 -H "Accept: application/vnd.github+json" ^
                                 https://api.github.com/repos/${repo}/pulls/${prNumber} ^
                                 -d "{\\"state\\":\\"closed\\"}"
                            """
                        }
                    }
                }
            }
        }

        stage('Merge to main') {
            when {
                allOf {
                    branch 'main'
                    expression { env.CHANGE_ID != null }
                }
            }
            steps {
                echo 'Already on main, no merge needed.'
            }
        }

        stage('Auto Merge to main if not main') {
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
                    def token = credentials('github-token')

                    echo "Merging PR #${prNumber} via GitHub API..."

                    bat """
                    curl -X PUT -H "Authorization: token ${token}" ^
                         -H "Accept: application/vnd.github+json" ^
                         https://api.github.com/repos/${repo}/pulls/${prNumber}/merge ^
                         -d "{\\"commit_title\\": \\"Auto-merged by Jenkins\\", \\"merge_method\\": \\"squash\\"}"
                    """
                }
            }
        }
    }
}
