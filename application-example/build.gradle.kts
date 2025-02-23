plugins {
    id("java")
}

group = "com.rolandsall"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.test {
    useJUnitPlatform()
}