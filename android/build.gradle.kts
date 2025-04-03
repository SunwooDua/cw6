buildscript {
    repositories {
        google()  // Ensure google() is in the repositories section
        mavenCentral()
    }
    dependencies {
        classpath 'com.google.gms:google-services:4.3.15'  // Add this line for Firebase
        classpath 'com.android.tools.build:gradle:7.2.2'   // Example version, may vary
    }
}
