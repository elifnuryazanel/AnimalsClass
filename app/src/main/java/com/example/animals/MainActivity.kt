package com.example.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main(args: Array<String>) {
        val d = Dog("Daisy", "Golden Retriever", 12)
        d.sound()
        d.eat()
        val c = Cat("Mira", "British Shorthair", 3)
        c.sound()
        c.eat()

    }
}