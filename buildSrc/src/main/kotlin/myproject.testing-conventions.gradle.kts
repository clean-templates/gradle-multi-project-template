
plugins {
    java
    `java-library`
    id("io.spring.dependency-management")
}



extra["junitVersion"] = "5.10.2"
extra["mockitoVersion"] = "5.2.0"
extra["junitEngine"] = "5.10.2"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api${property("junitVersion")}")
    testImplementation("org.mockito:mockito-core:${property("mockitoVersion")}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${property("junitEngine")}")
}

