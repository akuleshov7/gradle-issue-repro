pluginManagement {
    repositories {
        mavenCentral()
    }
    
}
rootProject.name = "gradle-issue-repro"
include("issue")
includeBuild("gradle/plugins")
