pipeline {
	agent any
	stages {
		stage('Checkout'){
			steps {
				checkout scm
			}
		}
		stage('Test') {
			steps {
				sh 'gradle test'
			}
		}
	}
}
