apply(plugin = "app.cash.zipline")

plugins {
  kotlin("multiplatform")
  kotlin("plugin.serialization")
}

kotlin {
  jvm {
    withJava()
  }

  js {
    browser()
  }

  sourceSets {
    commonMain {
      dependencies {
        implementation("app.cash.zipline:zipline")
      }
    }
  }
}
