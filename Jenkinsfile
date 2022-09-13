pipeline {
    agent any

    stages {
        stage('Clone git Repository') {
            steps {
                script {
                    try {
                      withCredentials([sshUserPrivateKey(credentialsId: "ssh-key", keyFileVariable: 'key')]) {
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
                  cathc (Exception e) {
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
                    main.echoFromGroovy()
                    main.echoFromGroovyInput("Input from Jenkinsfile")
                  }
                  cathc (Exception e) {
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
