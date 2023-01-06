repositories {
    maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
}

dependencies {
    api(project(":source"))
    compileOnly("org.spigotmc:spigot-api:1.9.4-R0.1-SNAPSHOT")
}