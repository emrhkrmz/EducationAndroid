package com.emrahkirmizi.objectprogrammingoriented

fun main() {
    //creating an object form class
    /*
    var myCar = Cars()
    myCar.name = "Ferrari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2010

    println("My car's name is ${myCar.name} and its model is ${myCar.model}")
    println("My car's name is ${myCar2.name} and its model is ${myCar2.model}")

     */

    //var myNewCar = MyCars("Ferrari", 2021)
    //println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}")

    var mySecondCars = MySecondCars("Mercedes", 2000)
    mySecondCars.name = "Opel"
    //mySecondCars.model = 2010 //set
    println("My second car's name is ${mySecondCars.name} and its model is ${mySecondCars.model}") //get

}