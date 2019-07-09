pipeline {
        agent any
        stages {
                stage('Build') {
                        steps {
                                script {
                                        echo "Iniciando build..."
					pwd
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
