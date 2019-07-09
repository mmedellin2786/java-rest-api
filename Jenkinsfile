pipeline {
        agent any
        stages {
                stage('Build') {
                        steps {
                                
                                  sh 'echo "Iniciando build..."'
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
