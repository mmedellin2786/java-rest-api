pipeline {
        agent any
        stages {
                stage('First') {
                        steps {
                                script {
                                        env.EXECUTE = 'True'
                                }
                        }
                }

 

                stage('Second') {
				      when {
                        allOf { environment name: 'EXECUTE', value: 'True'}
					  }
								
                        steps {
                                script {
                                        echo "Updating second stage"
										env.EXECUTE = 'False'
                                        echo "${env.EXECUTE}"
                                }
                        }
                }

 

                stage('Third') {
				
				        when {
                                expression {
                                        env.EXECUTE == 'True'
                                }
                        }
						
                        steps {
                                script {
                                        echo "Deploying yes"
                                }
                        }

 

                }
        }
}
