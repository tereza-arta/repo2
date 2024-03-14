pipeline {
    agent {
        docker { image 'python:latest }
    }
    stages {
        stage('Init stage') {
            steps {
                script {
                    echo "Hello from me...from Jenkinsfile"
                    sh 'python file.py'
                }
            }
        }
        stage('Build stage') {
            steps {
                echo "gradle version is: "
                sh 'gradle --version'
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
       
