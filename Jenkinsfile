pipeline {
    agent any
        stages {
            stage ('Compile Stage') {
                steps {
                    withMaven(maven: 'maven_3.6.2', jdk: 'jdk8-latest') {
                        sh 'mvn clean compile'
                    }
                }
            }
            stage ('Testing Stage') {
                steps {
                    withMaven(maven: 'maven_3.6.2', jdk: 'jdk8-latest') {
                        sh 'mvn test'
                    }
                }
            }
            stage ('Deployment Stage') {
                steps {
                    withMaven(maven: 'maven_3.6.2', jdk: 'jdk8-latest') {
                        sh 'mvn deploy'
                    }
                }
            }
        }
    }