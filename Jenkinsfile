pipeline {
    agent any

    stages {
        stage('Print Webhook Values') {
            steps {
                script {
                    // Print the values
                    echo "Branch Name: ${params.branchName}"
                    echo "Commit Message: ${params.commitMessage}"
                }
            }
        }
    }
}

/*pipeline{
  agent any
  stages {
    stage('Init stage'){
      steps{
        echo "Hello from init stage"
        echo params.branchName
        echo params.commitMessage
    }
 }    
    stage('Step 1'){
      when {
        expression { return params.target == "main" }
      }
      steps{
        echo "step 1"
      }
    }
    stage('Step 2'){
      when {
        expression { return params.current_status == "closed" && params.merged == true && params.branch == "dev" }
      }
      steps{
        echo "step 2"
      }
    }
  }
}
*/
