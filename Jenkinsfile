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
                  echo "${JENKINS_URL}/metrics/currentUser/"
                  sh "curl -x GET ${JENKINS_URL}metrics/7OB3fXudEXh-dfI2Cg_FjQdSdTHEebbcZP1tltmUYEvdbyUj4GwfL24EbowS0HGa/metrics?pretty=true"
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
