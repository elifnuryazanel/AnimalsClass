package com.example.animals

import android.util.Log

open class Pets (name: String, breed: String, age: Int) {
init{

    println("Name is: $name")
    println("Breed is: $breed.")
    println(" $age years old")

}


open var color: String ="All colors"
    open fun eat(){
        println("Animals eat food")
    }
    open fun sound(){
        println("Animals makes a sound")
    }
}