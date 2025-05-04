def call(String GitUrl, String GitBranch) {
        echo "Cloning start from shared lib ->"
        git url: "${GitUrl}", branch: "${GitBranch}" 
        sh "ls -lrt"
        echo "Code cloning successfull from shared lib!"
}