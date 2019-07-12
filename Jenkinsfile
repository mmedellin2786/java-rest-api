pipeline {
	agent {label 'master'}
        stages {
                stage('Build') {
                        steps { 
                                sh '''   
				         whoami
					 . ~/.profile
					 pwd
					 echo "Building..."
				         git init 
					 pwd 
					 rm -rf java-rest-api
					 git clone https://github.com/mmedellin2786/java-rest-api.git
					 cd java-rest-api
					 mvn clean install -e -DskipTests
				'''
			}
                        }
		 stage('Static test') {
                        steps { 
                                sh '''   
				         . ~/.profile
					 echo "Starting Static test con sonarqube..."
					 pwd 
					 cd java-rest-api
					 pwd
					 mvn sonar:sonar \
                                          -Dsonar.host.url=http://18.191.210.53/sonar \
                                          -Dsonar.login=7c625c897fc064f6cde86feeebf16bd283e0426e
				'''
			}
                        }
		stage('UnitTest') {
                        steps { 
                                sh '''   
					 . ~/.profile
					 echo "Starting UnitTest" 
					 pwd
					 cd java-rest-api
					 pwd
					 mvn clean test
					 
				'''
			}
                        }
		stage('Deploy') {
                        steps { 
                                sh '''   
					 ssh jenkins@18.191.237.18 'pwd'     
					 ssh jenkins@18.191.237.18 'mkdir -p /home/testeando'
					 echo "Starting Deployment" 
					 pwd 
				'''
			}
                        }
		
                }
  }
  
