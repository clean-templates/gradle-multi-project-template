plugins {
    id("myproject.spring-conventions")
    id("myproject.testing-conventions")
    id("myproject.package-conventions")
    id("application")
}


tasks.generateScript {
    mainClass.set("com.rolandsall.Main")
}

myApp {

}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
}






