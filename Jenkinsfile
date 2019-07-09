pipeline {
        agent any
        stages {
                stage('Build') {
                        steps {
                                
                                sh '''         
				         echo 'export M2_HOME=/usr/local/apache-maven/apache-maven-3.5.2' >> ~/.profile
                                         echo 'export M2=$M2_HOME/bin' >> ~/.profile
                                         echo 'export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.201.b09-0.amzn2.x86_64/' >> ~/.profile
                                         echo 'export PATH=$M2:$PATH' >> ~/.profile
                                         echo 'export PATH=$JAVA_HOME:$PATH' >> ~/.profile 
                                         . ~/.profile 
					 
					 echo "Iniciando build..."
				         pwd
					 cd /home/ec2-user/java-rest-api/java-rest-api
				         pwd
					 mvn -version
				'''
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
