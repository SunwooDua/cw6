plugins {
    id 'com.android.application'
    id 'com.google.gms.google-services'  // Add this line to apply Firebase services
}

android {
    compileSdkVersion 33  // Or whatever the latest version is

    defaultConfig {
        applicationId "com.example.yourapp"
        minSdkVersion 21
        targetSdkVersion 33
        versionCode flutterVersionCode.toInteger()
        versionName flutterVersionName
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            signingConfig signingConfigs.release
        }
    }

    // Additional configurations can go here
}

dependencies {
    implementation 'com.google.firebase:firebase-auth:21.0.5'  // Firebase Auth
    implementation 'com.google.firebase:firebase-firestore:24.0.1'  // Firebase Firestore
    implementation 'com.google.android.material:material:1.6.0'  // Material Design
    implementation 'androidx.appcompat:appcompat:1.4.1'  // Support for Material
}
