pipeline {
    agent { label 'docker_based_agent' }

    stages {
        stage('Init stage') {
            steps {
                script {
                    echo "Hello from me...from Jenkinsfile...."
                }
            }
        }
        stage('Build stage') {
            steps {
                echo "docker version is :"
                sh 'docker --version'
                sh 'docker build -t image_for_cpp:local .'
                echo "Image was successfully assembled"
                sh 'docker run --name container image_for_cpp:local'
                echo "Exit from Jenkinsfile"
            }
        }
    }
}
       
