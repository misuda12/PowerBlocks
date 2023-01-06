plugins { id("com.github.johnrengelman.shadow") }

dependencies {
    api(project(":bukkit_1_08"))
    api(project(":bukkit_1_09"))
    api(project(":bukkit_1_17"))
    api(project(":common"))
}

tasks {
    artifacts.archives(shadowJar)
    shadowJar.get().relocate("io.papermc", "ext.paper")
}