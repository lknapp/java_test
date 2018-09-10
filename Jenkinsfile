pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'cd java_test && git pull'
                sh 'cd java_test && gradle test'
            }
        }
    }
}
