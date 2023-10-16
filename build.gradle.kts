plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.mikemybytes:junit5-formatted-source-tests:1.0.0")
    implementation("com.mikemybytes:junit5-formatted-source:1.0.0")
    implementation("com.mikemybytes:junit5-formatted-source-parent:1.0.0")
    implementation("com.mikemybytes:junit5-formatted-source-parent:1.0.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.13.1")
}

tasks.test {
    useJUnitPlatform()
}