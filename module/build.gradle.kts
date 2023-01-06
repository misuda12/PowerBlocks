plugins { id("com.github.johnrengelman.shadow") }

dependencies {
    api(project(":bukkit_1_08"))
    api(project(":bukkit_1_09"))
    api(project(":bukkit_1_17"))
    api(project(":common"))
    compileOnly("org.spigotmc:spigot-api:1.19.3-R0.1-SNAPSHOT")
}

tasks {
    artifacts.archives(shadowJar)
    shadowJar.get().relocate("io.papermc", "ext.paper")
}