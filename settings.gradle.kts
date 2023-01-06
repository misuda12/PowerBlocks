rootProject.name = "PowerBlocks"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val shadowVersion: String by settings
        id("com.github.johnrengelman.shadow") version shadowVersion
        kotlin("jvm") version kotlinVersion
    }
}

include("source", "assets"
    , "bukkit_1_08", "bukkit_1_09", "bukkit_1_17")