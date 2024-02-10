plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.newsappmultimodulekotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsappmultimodulekotlin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = false
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Deps.core)
    implementation(Deps.lifecycle)
    implementation(Deps.material)
    implementation(Deps.appcompat)
    implementation(Deps.constraintlayout)
    implementation(Navigation.navigation_fragment)
    implementation(Navigation.navigation_ui)
    testImplementation(TestDeps.junit)
    androidTestImplementation(AndroidTestDeps.junit_ext)
    androidTestImplementation(AndroidTestDeps.espresso_core)


}