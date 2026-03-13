def call(String project = 'Prueba', boolean usoscripts = true) {
    node {
        stage ('Checkout APP'){
            checkout scm
        }

        stage ('Restore') {            
            bat 'dotnet restore'
        }

        stage ('build') {
            bat 'dotnet build'
        }

    }    
}

return this