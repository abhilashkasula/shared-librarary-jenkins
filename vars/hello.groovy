def call(Map details) {
    pipeline {
        agent any
        stages {
            stage('Greet') {
                steps {
                    sh "echo ${details.person.name}"
                }
            }
        }
    }
}
