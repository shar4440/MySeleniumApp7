pipeline{
  agent any

  tools{
    maven 'Maven'
  }

  stages{
    stage('Checkout'){
      steps{
        git branch: 'master' , url: 'https://github.com/shar4440/MySeleniumApp7.git'
    }
  }
    stage('Build'){
      steps{
        sh 'mvn clean install'
      }
    }
    stage('Test'){
      steps{
        sh 'mvn test'
      }
    }
    stage('Run-Application'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
      }
    }
}
  post{
    success{
      echo "build and deplou successed"
    }
    failure{
      echo " build get failed"
    }
  }
}
