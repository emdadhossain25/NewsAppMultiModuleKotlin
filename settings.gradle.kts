pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "News App MultiModule Kotlin"
include(":app")
include(":news:news_presentation")
include(":news:news_data")
include(":news:news_domain")
include(":search:search_data")
include(":search:search_domain")
include(":search:search_presentation")
include(":common:common_utils")
