pipeline{
    agent any
    tools{
        maven 'MAVE_HOME'
    }
    stages{
        stage('checking'){
            steps{
                git branch:'master', url:'https://github.com/jarmoil/otp1_Week6.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install' // sh for linux and ios
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }

    }


}