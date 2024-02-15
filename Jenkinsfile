node {
      def app
      stage('Clone repository') {

            checkout scm
      }
      stage('Build image') {

            app = docker.build("imotszeged/test-boot")
       }

       stage('Push image') {
                                                  docker.withRegistry('https://registry.hub.docker.com', 'dockerhub_id') {
       app.push("${env.BUILD_NUMBER}")
       app.push("latest")
              }
           }
        }
