import com.i27academy.builds.Calculator
Calculator calculator = new Calculator(this)
pipeline{
    agent any
    stages {
        stage ('first stage') {
            steps {
                script {
                    echo "printing sum of two numbers"
                    println calculator.add(5,3)
                }

            }
        }
    }
}