plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

extra["springBootVersion"] = "3.4.2"
extra["springDependencyManagementVersion"] = "1.1.7"


dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${property("springBootVersion")}")
    implementation("io.spring.gradle:dependency-management-plugin:${property("springDependencyManagementVersion")}")


}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}