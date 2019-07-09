pipeline {
        agent any
        stages {
                stage('Build') {
                        steps {
                                script {
                                         sh echo "Iniciando build..."
					 sh pwd
                                }
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
