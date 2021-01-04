def call(name) {
    pipeline {
        agent any
        stages {
            stage('Greet') {
                sh "echo ${name}"
            }
        }
    }
}