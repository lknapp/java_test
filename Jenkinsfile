node('node') {
	stage('Checkout'){
		checkout scm
	}
	stage('Test') {
		sh 'gradle test'
	}
}
