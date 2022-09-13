pipeline {
    agent any

    stages {
/*         stage('Clone git Repository') {
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
        } */
        stage('Run Groovy script') {
            steps {
                script {
                  sh "ls"
                  def var2 = load "vars/main.groovy"
                  var2.echoFromGroovy()
                  var2.echoFromGroovyInput("Input from Jenkinsfile")
                  def var1 = load "vars/t1.groovy"
                  var1.getInstance()
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
