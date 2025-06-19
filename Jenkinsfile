// Jenkinsfile
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
            post {
                failure {
                    error('Build failed, stopping pipeline.')
                }
            }
        }

        stage('Merge to main') {
            when {
                branch 'main'
            }
            steps {
                echo 'Already on main, no merge needed.'
            }
        }

        stage('Auto Merge to main if not main') {
            when {
                not {
                    branch 'main'
                }
            }
            steps {
                script {
                    // Assumes you have push rights via SSH key and "main" branch exists
                    bat '''
                        git config user.name "jenkins"
                        git config user.email "jenkins@yourdomain.com"
                        git fetch origin main
                        git checkout main
                        git merge origin/${BRANCH_NAME}
                        git push origin main
                    '''
                }
            }
        }
    }
}
