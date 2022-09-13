libraries {
  lib('pipeline-library-demo')
}

pipeline {
    agent any

    stages {
        stage('Clone git Repository') {
            steps {
                script {
                    try {
                      withCredentials([sshUserPrivateKey(credentialsId: "jenkins2", keyFileVariable: 'key')]) {
                        //auth to git here then do some commands for example:
                        sh 'git clone git@github.com:lennca/website.git'
                      }
                    } catch (Exception e) {
                      echo "Exception:"
                      echo e.getMessage()
                    }
                }
            }
        }
        stage('Pull and Run Docker container') {
            steps {
                script {
                  try {
                    sh 'docker pull ubuntu:20.04'
                    sh 'docker run -dit ubuntu:20.04'
                  }
                  catch (Exception e) {
                    echo "Exception:"
                    echo e.getMessage()
                  }
                }
            }
        }
        stage('Run Groovy script') {
            steps {
                script {
                  try {
                    def var2 = load "main.groovy"
                    var2.echoFromGroovy()
                    var2.echoFromGroovyInput("Input from Jenkinsfile")
                  }
                  catch (Exception e) {
                    echo "Exception:"
                    echo e.getMessage()
                  }
                }
            }
        }
    }
    post {
        always {
            deleteDir()
        }
    }
}
