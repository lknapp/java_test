pipeline {
    agent any
    stages {
		stage('Checkout'){
			checkout scm
		}
		stage('Test') {
			sh 'gradle test'
		}
    }
}
