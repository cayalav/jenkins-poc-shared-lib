def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Project name is ${config.projectName}. - helloWorld"
}