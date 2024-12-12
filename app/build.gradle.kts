plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.asmat.rolando.nightwing"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.asmat.rolando.nightwing"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        buildConfigField("String", "THE_MOVIE_DB_API_KEY", THE_MOVIE_DB_API_KEY)
        buildConfigField("String", "THE_MOVIE_DB_BASE_URL", THE_MOVIE_DB_BASE_URL)
//        javaCompileOptions {
//            annotationProcessorOptions {
//                arguments = ["room.schemaLocation":
//                                     "$projectDir/schemas".toString()]
//            }
//        }
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}


dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.1'

    // Room
    def room_version = "2.4.0-alpha04"
    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
    implementation "androidx.room:room-ktx:$room_version"
    testImplementation "androidx.room:room-testing:$room_version"

    // Live Data
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.4.0"

    // Coroutine
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0'

    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.2'

    // Navigation
    implementation 'androidx.navigation:navigation-runtime-ktx:2.4.0-rc01'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.4.0-rc01'
    implementation 'androidx.navigation:navigation-ui-ktx:2.4.0-rc01'

    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    implementation 'com.squareup.picasso:picasso:2.71828'
    implementation 'androidx.annotation:annotation:1.2.0'
    androidTestImplementation 'androidx.test.espresso:espresso-contrib:3.1.0', {
        exclude group: 'com.android.support', module: 'support-annotations'
        exclude group: 'com.android.support', module: 'support-v4'
        exclude group: 'com.android.support', module: 'design'
        exclude group: 'com.android.support', module: 'recyclerview-v7'
    }
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.9.0'
    implementation 'io.reactivex.rxjava2:rxjava:2.2.9'
    implementation 'io.reactivex.rxjava2:rxandroid:2.1.0'

    implementation 'com.google.dagger:dagger:2.35.1'
    annotationProcessor 'com.google.dagger:dagger-compiler:2.28'
    kapt 'com.google.dagger:dagger-compiler:2.28'
    implementation 'com.google.dagger:dagger-android:2.35.1'
    implementation 'com.google.dagger:dagger-android-support:2.22.1'
    // if you use the support libraries
    annotationProcessor 'com.google.dagger:dagger-android-processor:2.22.1'
    kapt 'com.google.dagger:dagger-android-processor:2.22.1'
    // JUnit 4 framework
    testImplementation 'junit:junit:4.12'
    // Robolectric environment
    testImplementation 'androidx.test:core:1.3.0'
    // Mockito framework
    testImplementation 'org.mockito:mockito-core:2.23.0'

    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test:rules:1.3.0'
    // Optional -- Hamcrest library
    androidTestImplementation 'org.hamcrest:hamcrest-library:1.3'
    // Optional -- UI testing with Espresso
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
    // Optional -- UI testing with UI Automator
    androidTestImplementation 'androidx.test.uiautomator:uiautomator:2.2.0'

    testImplementation "com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0"
    testImplementation 'android.arch.core:core-testing:1.1.1'

    // Paging library
    implementation "androidx.paging:paging-runtime-ktx:3.1.0"
    // alternatively - without Android dependencies for tests
    testImplementation "androidx.paging:paging-common-ktx:3.1.0"

}
