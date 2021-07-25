pipeline {
    agent any

 stages {
     stage('Compile') {
        steps {
            withMaven(maven:'maven-3.8.1'){
                sh 'mvn clean compile '
            }

        }
     }
     
     stage('Testing') {
        steps {
            withMaven(maven:'maven-3.8.1'){
                sh 'mvn test'
            }

        }
     }
     
     stage('Buld') {
        steps {
            withMaven(maven:'maven-3.8.1'){
                sh 'mvn install'
            }

        }
     }
 }
}
