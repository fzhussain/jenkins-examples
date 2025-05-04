def call(String ProjectNameDirectory, String ImageName, String ImageTag, String DockerHubUser) {
        echo "Building start from shared lib ->"
        sh "cd ${ProjectNameDirectory} && docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
        echo "Code build successfull from shared lib!"
}