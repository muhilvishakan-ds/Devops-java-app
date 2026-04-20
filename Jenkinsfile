pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/muhilvishakan-ds/Devops-java-app.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
        stage('Deploy to AWS EC2') {
            steps {
                sh '''
                    scp -i /var/jenkins_home/.ssh/id_rsa -o StrictHostKeyChecking=no \
                    target/devops-java-app-1.0.0.jar \
                    ubuntu@13.233.37.50:~/devops-java-app-1.0.0.jar
                    
                    ssh -i /var/jenkins_home/.ssh/id_rsa -o StrictHostKeyChecking=no \
                    ubuntu@13.233.37.50 \
                    "sudo systemctl restart devops-app"
                '''
            }
        }
    }
    post {
        success {
            echo 'Deployed successfully to AWS EC2!'
        }
        failure {
            echo 'Deployment failed!'
        }
    }
}
