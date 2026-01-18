pipeline {
    agent any

    tools {
        maven 'Maven-3.9.9'
        jdk 'JDK-21'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/SanjayR14/simple-java-maven-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile -Denforcer.skip=true'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test -Denforcer.skip=true'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        failure {
            echo 'Build failed due to test failure'
        }
        success {
            echo 'Pipeline completed successfully'
        }
    }
}
