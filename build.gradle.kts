allprojects{
    configurations.all{
        resolutionStrategy{
            force("androidx.activity:activity:1.8.2")
            force("androidx.core:core-ktx:1.12.0")
            force("androidx.core:core:1.12.0")
        }
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}