package com.example.animals

class Dog : Pets {
    constructor(name: String, breed: String, age: Int){

        println("Dog name is $name")
        println("Dog's breed is $breed")
        println("Dog is  $age years old")


    }

    override var color = "White"


    override fun eat() {
        println("Dogs eat lap or dried dog food")
    }

    override fun sound() {
        println("Dogs bark.")
    }
}





