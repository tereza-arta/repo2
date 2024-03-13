pipeline {
    agent {
        any { image 'node:12.16.2' args '-p 3000:3000'  }
    }
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
                echo "node version is: "
                sh 'node --version'
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
       
