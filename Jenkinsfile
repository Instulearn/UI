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
                sh 'mvn clean install'
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
                    sh '''
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
