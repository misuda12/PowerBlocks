import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    java
}

group       = "com.github.misuda12"
version     = "1.0-SNAPSHOT"
description = ""

allprojects {
    repositories {
        maven { url = uri("https://repo.aikar.co/content/groups/aikar/") }
        maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
        maven { url = uri("https://jitpack.io") }
        mavenCentral()
    }

    dependencies {
        compileOnly(kotlin("stdlib"))
        testImplementation(kotlin("test"))
    }

    kotlin {
        sourceSets.all {
            with(languageSettings) {
                progressiveMode = true
                enableLanguageFeature("InlineClasses")
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
    options.isFork = true
    options.forkOptions.executable = "javac"
    options.release.set(8)
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        javaParameters = true
    }
}

subprojects {
    tasks {
        creating(Jar::class) {
            from(sourceSets["main"].allSource)
            archiveClassifier.set("sources")
        }
    }
}