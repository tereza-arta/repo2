pipeline {
    agent { label 'docker_based_agent' }

    stages {
        stage('Init stage') {
            steps {
                script {
                    echo "Hello from me...from Jenkinsfile..."
                }
            }
        }
        stage('Build stage') {
            steps {
                echo "docker version is :"
                sh 'docker --version'
            }
        }
    }
}
       
