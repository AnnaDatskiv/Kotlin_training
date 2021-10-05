package com.example.annad

import android.util.Log

abstract class Animal(val name: String, val age: Int) {
    abstract val bones: Int

    protected fun move(seconds: Int) {
        val isMusculUsed = useMuscul()


        Log.d("tag", "animal moves $seconds seconds")
        Log.d("tag", "muscul used: $isMusculUsed")
    }

    private fun useMuscul(): Boolean {


        Log.d("tag", "animal uses musculs")
        return true
    }
}