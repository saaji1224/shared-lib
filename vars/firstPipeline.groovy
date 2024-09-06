import com.i27academy.builds.Calculator

def call(Map pipelineParams) {
    library ("com.i27academy.slb") // jenkins library name
Calculator calculator = new Calculator(this)
    pipeline{
        agent any
        environment {
            APP_NAME = "${pipelineParams.appName}"
        }
        stages {
            stage ('first stage') {
                steps {
                    script {
                        echo "printing sum of two numbers"
                        println calculator.add(5,3)
                        echo "micro service name is: ${APP_NAME}"
                    }

                }
            }
        }
    }
}

