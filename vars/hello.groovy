def call(name) {
    pipeline {
        agent any
        stages {
            stage('Greet') {
                steps {
                    sh "echo ${name}"
                }
            }
        }
    }
}
