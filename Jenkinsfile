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

             stage('Trigger deploy..') {

                steps {

                   sh """curl https://api.render.com/deploy/srv-cn92e6v109ks739s1sj0?key=QSUb0v-o00E"""

                }
             }
        }
