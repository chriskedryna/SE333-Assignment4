pipeline {
  agent any // The agent directive allocates an executor for the entire Pipeline

  tools {
    maven "M3"
  }

    stages {
        stage('Build') {
            steps {
                // Replace 'make' with your actual build command (e.g., 'npm install', 'mvn clean package')
                git 'https://github.com/chriskedryna/SE333-Assignment4.git'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Replace 'make check' and 'reports/**/*.xml' with your actual test commands and report paths
                sh 'mvn test'
            }
        }
    }
}
