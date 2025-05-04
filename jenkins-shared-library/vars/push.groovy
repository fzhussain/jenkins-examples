def call(String ImageName, String ImageTag) {
        echo "Building start from shared lib ->"
        withCredentials ([
            usernamePassword("credentialsId": "dockerhubCred",
            passwordVariable: "dockerHubPass",
            usernameVariable: "dockerHubUsername")    
        ]) {
                 sh "docker login -u ${env.dockerHubUsername} -p ${env.dockerHubPass}"
                 // sh "docker image tag ${ImageName}:${ImageTag} ${env.dockerHubUsername}/${ImageName}:${ImageTag}"
                 sh "docker push ${env.dockerHubUsername}/${ImageName}:${ImageTag}"
                 echo "Pushed to registry from shared lib!"
            }
}

                