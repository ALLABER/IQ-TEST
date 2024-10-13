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

rootProject.name = "IQ-TEST"
include(":app")
include(":core:domain")
include(":core:data")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":utils")
include(":feature:instructions:ui")
include(":feature:instructions:navigation")
include(":feature:home:ui")
include(":feature:home:navigation")
include(":ui:localization")
include(":feature:result:ui")
include(":feature:result:navigation")
include(":feature:test:ui")
include(":feature:test:navigation")
include(":feature:age-entry:ui")
include(":feature:age-entry:navigation")
include(":ui:components")
include(":ui:assets")
