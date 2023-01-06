rootProject.name = "PowerBlocks"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val shadowVersion: String by settings
        id("com.github.johnrengelman.shadow") version shadowVersion
        kotlin("jvm") version kotlinVersion
    }
}