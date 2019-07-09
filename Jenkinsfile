pipeline {
        agent any
        stages {
                stage('Build') {
                        steps {
                                
                                         sh 'echo "Iniciando build..."'
					 sh 'cd /home/ec2-user/java-rest-api/java-rest-api/'
					 //sh 'mvn clean install -e'
                        }
                }

 

                stage('Static test') {
								
                        steps {
                                script {
                                        echo "Iniciando static test con Sonarq"
                                }
                        }
                }
        }
}
