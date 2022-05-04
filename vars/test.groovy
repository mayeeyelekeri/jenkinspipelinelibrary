def call(body) { 
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config 
  body()

  pipeline { 
    agent any 

    environment { 
    } // end of env 

    stage('Build') {
      steps { 
        echo "inside build " 
      }
    } // end of build stage 
  }
}
