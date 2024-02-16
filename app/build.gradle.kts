plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
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

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    dataBinding {
        enable = true
    }
}

dependencies {
    implementation(project(":common:common_utils"))


    implementation(project(":news:news_presentation"))
    implementation(project(":news:news_domain"))
    implementation(project(":news:news_data"))

    implementation(project(":search:search_presentation"))
    implementation(project(":search:search_data"))
    implementation(project(":search:search_domain"))


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
    implementation(Dagger.hilt_android)
    kapt(Dagger.hilt_compiler)
    implementation(ConstraintLayout.constraint_layout)
    implementation(Lottie.lottie)

}

kapt {
    correctErrorTypes = true
}