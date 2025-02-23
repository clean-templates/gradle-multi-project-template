plugins {
    id("myproject.spring-conventions")
    id("myproject.testing-conventions")
}

group = "com.rolandsall"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
}




