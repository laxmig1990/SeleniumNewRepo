pipeline {
  agent any
  stages {
    stage('Build')  {
        steps {
          echo 'Build World'
        }
    }
    stage('Deploy')
    {
      steps {
        echo 'Test World'
      }
    }
    stage('Test')
    {
      steps {
        echo 'Test World'
      }
    }
  }
  post
  {
    always
    {
      emailext body: 'Summary', subject: 'Pipeline Status', to: 'laxmi.g1990@gmail.com'
    }

  }
}
