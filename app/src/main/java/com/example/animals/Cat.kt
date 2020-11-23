package com.example.animals

class Cat : Pets {
    constructor(name: String, breed: String, age: Int){

        println("Cat's name is $name")
        println("Cat's breed is $breed")
        println("Cat is  $age years old")


    }

    override var color = "Black"


    override fun eat() {
        println("Cats eat lap or dried cat food")
    }

    override fun sound() {
        println("Cats waul.")
    }
}