<<<<<<< Updated upstream
// Jenkinsfile
pipeline {
    agent any

=======
pipeline {
    agent any

    environment {
        BRANCH_NAME = "${env.GIT_BRANCH.replaceFirst('origin/', '')}"
    }

>>>>>>> Stashed changes
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
<<<<<<< Updated upstream
                bat 'mvn clean install'
            }
            post {
                failure {
                    script {
                        def prNumber = env.CHANGE_ID // Multibranch PR numarası
                        if (prNumber) {
                            echo "Build failed on PR #${prNumber}, closing PR..."
                            def repo = 'Instulearn/UI'  // GitHub repo adı owner/repo şeklinde
                            def token = credentials('github-token')

                            bat """
                            curl -X PATCH -H "Authorization: token ${token}" \
                            -H "Accept: application/vnd.github+json" \
                            https://api.github.com/repos/${repo}/pulls/${prNumber} \
                            -d '{"state":"closed"}'
                            """
                        }
                    }
                }
=======
                bat 'mvn clean install' // Windows kullanıyorsan bat, Unix ise sh
>>>>>>> Stashed changes
            }
        }

        stage('Merge to main') {
            when {
<<<<<<< Updated upstream
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
                    bat """
                        git config user.name "jenkins"
                        git config user.email "jenkins@yourdomain.com"
                        git fetch origin main
                        git checkout main
                        git merge origin/${BRANCH_NAME}
                        git push origin main
                    """
                }
=======
                expression { env.BRANCH_NAME != 'main' }
            }
            steps {
                bat '''
                    git config user.name "jenkins"
                    git config user.email "jenkins@yourdomain.com"
                    git checkout main
                    git pull origin main
                    git merge origin/%BRANCH_NAME%
                    git push origin main
                '''
>>>>>>> Stashed changes
            }
        }
    }
}
