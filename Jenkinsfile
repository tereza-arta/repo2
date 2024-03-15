pipeline {
    agent any
    stages {
        stage('Init stage') {
            steps {
                script {
                    echo "Hello from Jenkinsfile of repo2"
                }
            }
        }
        /*stage('Build stage') {
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
        }*/
    }
}
       
