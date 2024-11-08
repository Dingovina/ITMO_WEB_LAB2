plugins {
    java
    war
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.8.9")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.google.guava:guava:32.1.1-jre")
    implementation("jakarta.platform:jakarta.jakartaee-web-api:9.0.0")
    
    implementation("jakarta.servlet:jakarta.servlet-api:6.0.0")
    implementation("jakarta.json:jakarta.json-api:2.1.1")
    implementation("jakarta.json.bind:jakarta.json.bind-api:3.0.0")
    implementation("jakarta.ejb:jakarta.ejb-api:4.0.1")
}