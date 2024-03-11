pipeline{
  agent any
  stages {
    stage('Init stage'){
      steps{
        echo "Hello from init stage"
        echo target
        echo params.hel
      }
    }
    /*stage('Step 1'){
      when {
        expression { return params.current_status == "closed" && params.merged == true && params.branch == "dev" }
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
    }*/
  }
}
