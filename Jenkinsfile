pipeline {
    agent any

    stages {
        stage('Print Webhook Values') {
            steps {
                script {
                    // Print the valuesbrabranchName = refs/heads/mainbranchName = refs/heads/mainnchName = refs/heads/main
                    echo "Hello from me...... ... ... ..."
                    echo "action is: " + env.action
                    echo "Source branch is " + env.source_branch
                    echo "Target branch is " + env.target_branch
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
