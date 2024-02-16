pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'speminiproject'
        GITHUB_REPO_URL = 'https://github.com/abhipsa2002/Scientific-Calculator.git'
    }

    stages {
          stage('Cleanup') {
            steps {
                script{  
                // Remove specific Docker containers
                sh 'docker rm -f calculator'
                }
            }
        }

        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

      stage('Build Maven Project') {
            steps {
                script {
                    // Build Maven project
                        sh 'mvn clean install'
                }
            }
        }
      
        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                    sh 'docker tag speminiproject abhipsapanda/speminiproject:latest'
                    sh 'docker push abhipsapanda/speminiproject'
                    }
                 }
            }
        }

   stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }

    }

    post {
        always {
            // Send email notification for every build
            emailext(
                subject: "Pipeline Status: ${currentBuild.result}",
                body: "Build Status: ${currentBuild.result}\n\nCheck the Jenkins console for details.",
                to: "pabhipsa02@gmail.com",
                from: "smtp.gmail.com",
            )
            script {
                // Email notification configuration
                emailext (
                    subject: "Build ${currentBuild.fullDisplayName} ${currentBuild.result}",
                    body: "Build URL: ${BUILD_URL}",
                    to: "pabhipsa02@gmail.com", // Add your recipient email address here
                    mimeType: 'text/html',
                )
            }
        }
    }

}
