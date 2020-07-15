package com.example.kotlinnativeapp

expect fun platformName() : String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}