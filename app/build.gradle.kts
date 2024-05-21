plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "pena.camila.alkewallet"
    compileSdk = 34

    defaultConfig {
        applicationId = "pena.camila.alkewallet"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }



    kotlinOptions {
        jvmTarget = "1.8"
    }

    // habilitar viewBinding
    viewBinding {
        enable = true
    }

}

dependencies {
    val nav_version = "2.7.7"

    // Java language implementation
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    
    //1 Implementar las librerìas necesarias para el proyecto
    implementation (libs.kotlinx.coroutines.android)
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


}