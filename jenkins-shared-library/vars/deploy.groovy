def call(String ProjectNameDirectory) {
    sh "cd ${ProjectNameDirectory} && docker compose up -d"
}
