object Versions {
    const val core = "1.12.0"
    const val lifecycle = "2.7.0"
    const val compose = "1.8.2"
    const val compose_bom = "1.8.2"
    const val material = "1.11.0"
    const val appcompat = "1.6.1"
    const val constraintlayout = "2.1.4"
    const val navigationfragment = "2.7.6"
    const val junit = "4.13.2"
    const val junit_ext = "1.1.5"
    const val espresso_core="3.5.1"
    const val android_test_bom = "2023.08.00"
}
//implementation("androidx.core:core-ktx:1.12.0")
//androidx.lifecycle:lifecycle-runtime-ktx
//androidx.activity:activity-compose:1.8.2

object Deps {
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"


}

object Compose {
    const val compose = "androidx.activity:activity-compose:${Versions.compose}"
    const val compose_bom = "androidx.compose:compose-bom:${Versions.compose_bom}"
    const val compose_ui = "androidx.compose.ui:ui"
    const val compose_graphics = "androidx.compose.ui:ui-graphics"
    const val compose_ui_tooling = "androidx.compose.ui:ui-tooling-preview"
    const val compose_material = "androidx.compose.material3:material3"
}

object Navigation {
    const val navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationfragment}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigationfragment}"
}

object TestDeps {
    const val junit = "junit:junit:${Versions.junit}"
    const val compose_junit = "androidx.compose.ui:ui-test-junit4"
}

object AndroidTestDeps{
    const val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    const val compose_bom = "androidx.compose:compose-bom:${Versions.android_test_bom}"

}

object DebugDeps{
    const val ui_tooling = "androidx.compose.ui:ui-tooling"
    const val ui_test_manifest = "androidx.compose.ui:ui-test-manifest"
}