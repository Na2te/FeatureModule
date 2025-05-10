pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

// projects.모듈.~ 꼴로 바로 imple 하기 위한 설정
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "FeatureModule"
include(":app")
include(":feature:start")
include(":feature:second")
