package com.example.annad

import android.util.Log

class Dog(name: String, age: Int) : Animal(name, age) {
    override val bones: Int = 180
    fun run(seconds: Int) {

        Log.d("tag", "dog moves $seconds seconds")
        move(seconds)
    }
}