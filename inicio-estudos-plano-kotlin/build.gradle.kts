plugins {
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.serialization") version "1.9.24"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Testes
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Serialização JSON
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")

    // Ktor Client Core
    implementation("io.ktor:ktor-client-core:2.3.7")
    // Ktor Client Engine (CIO é o mais comum para JVM)
    implementation("io.ktor:ktor-client-cio:2.3.7")
    // Ktor Content Negotiation (para serialização/deserialização automática)
    implementation("io.ktor:ktor-client-content-negotiation:2.3.7")
    // Ktor Serialization com kotlinx.serialization
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.7")

    // Coroutines (opcional, mas recomendado para projetos Kotlin puros)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    implementation("ch.qos.logback:logback-classic:1.4.14")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}