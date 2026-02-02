pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('My Sonar Server') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy stage (AWS / EC2 / S3 etc)'
            }
        }
    }
}
