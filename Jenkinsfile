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
				         git init 
					 pwd 
					 rm -rf java-rest-api
					 git clone https://github.com/mmedellin2786/java-rest-api.git	
					 mvn clean install -e
				'''
			}
                        }
		 stage('Static test') {
                        steps { 
                                sh '''   
					 echo "Iniciando Static test con sonarqube..."
					 pwd 
					 mvn sonar:sonar \
                                          -Dsonar.host.url=http://18.191.210.53/sonar \
                                          -Dsonar.login=7c625c897fc064f6cde86feeebf16bd283e0426e
				'''
			}
                        }
		
                }
  }
