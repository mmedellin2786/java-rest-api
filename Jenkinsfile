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
					 echo "Starting Deployment" 
					 sudo systemctl start myproject-0.0.1-SNAPSHOT 
					 echo "Daemon running...."
				'''
			}
                        }
		
                }
  }
  
