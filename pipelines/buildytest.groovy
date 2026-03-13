def call(String project = 'Prueba', boolean usoscripts = true) {
    node {
        stage ('Checkout APP'){
            checkout scm
        }

        stage ('Restore') {
            powershell "${project}"
            bat 'dotnet restore'
        }

        stage ('build') {
            powershell "${usoscripts}"
            bat 'dotnet build'
        }

    }    
}

return this