// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    apply(from = "depend.gradle")
}

plugins {

    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.google.dagger.hilt.android") version "2.44.2" apply false
    id("org.jetbrains.kotlin.jvm") version "1.8.0" apply false
    //id 'androidx.navigation.safeargs' version '2.6.0' apply false

}
