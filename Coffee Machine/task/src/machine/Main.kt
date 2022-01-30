package machine

import kotlin.system.exitProcess


var waterIn = 400
var milkIn = 540
var coffeeIn = 120
var dispCups = 9
var moneyIn = 550

var list = mutableListOf<Int>(waterIn, milkIn, coffeeIn)

fun main() {


   actionMenu()


    }

fun machineState() {
    println("")
    println("The coffee machine has:")
    println("$waterIn of water")
    println("$milkIn of milk")
    println("$coffeeIn of coffee beans")
    println("$dispCups of disposable cups")
    println("$$moneyIn of money")
    println("")
    actionMenu()



}

fun actionMenu() {
    print("Write action (buy, fill, take, remaining, exit): ")
    when (readln()) {
        "buy" -> buy()
        "fill" -> fillF()
        "take" -> takeF()
        "remaining" -> machineState()
        "exit" -> System.exit(0)
    }

}

fun takeF() {
    println("")
   println("I gave you $$moneyIn")
    moneyIn = 0

    println()
   actionMenu()
}

fun fillF() {
    println("")
     print("Write how many ml of water do you want to add: ")
    waterIn += readln().toInt()
     print("Write how many ml of milk do you want to add: ")
    milkIn += readln().toInt()
     print("Write how many grams of coffee beans do you want to add: ")
    coffeeIn += readln().toInt()
     print("Write how many disposable cups of coffee " +
             "do you want to add: ")
    dispCups += readln().toInt()

    list = mutableListOf<Int>(waterIn, milkIn, coffeeIn)
    println("")
    actionMenu()
}

fun buy() {
    println("")
    print(
        "What do you want to buy? 1 - espresso, " + "2 - latte, " +
                "3 - cappuccino, back - to main menu: "
    )
    when (readln()) {

        "1" -> {
            moneyIn += 4
            waterIn -= 250
            coffeeIn -= 16
            dispCups -= 1
            if (waterIn < 0){
                println("Sorry, not enough water!")
                moneyIn -= 4
                waterIn += 250
                coffeeIn += 16
                dispCups += 1
                println("")
                actionMenu()
            }
            if (milkIn < 0){
                println("Sorry, not enough milk!")
                moneyIn -= 4
                waterIn += 250
                coffeeIn += 16
                dispCups += 1
                println("")
                actionMenu()
            }
            if (dispCups < 0) {
                println("Sorry, not enough disposable cups!")
                moneyIn -= 4
                waterIn += 250
                coffeeIn += 16
                dispCups += 1
                println("")
                actionMenu()
            }
        }
        "2" -> {
            moneyIn += 7
            waterIn -= 350
            milkIn -= 75
            coffeeIn -= 20
            dispCups -= 1
            if (waterIn < 0){
                println("Sorry, not enough water!")
                moneyIn -= 7
                waterIn += 350
                milkIn += 75
                coffeeIn += 20
                dispCups += 1
                println("")
                actionMenu()
            }
            if (milkIn < 0){
                println("Sorry, not enough milk!")
                moneyIn -= 7
                waterIn += 350
                milkIn += 75
                coffeeIn += 20
                dispCups += 1
                println("")
                actionMenu()
            }
            if (coffeeIn < 0){
                println("Sorry, not enough coffee beans!")
                moneyIn -= 7
                waterIn += 350
                milkIn += 75
                coffeeIn += 20
                dispCups += 1
                println("")
                actionMenu()
            }
            if (dispCups < 0) {
                println("Sorry, not enough disposable cups!")
                moneyIn -= 7
                waterIn += 350
                milkIn += 75
                coffeeIn += 20
                dispCups += 1
                println("")
                actionMenu()
            }
        }
        "3" -> {
            moneyIn += 6
            waterIn -= 200
            milkIn -= 100
            coffeeIn -= 12
            dispCups -= 1
            if (waterIn < 0){
                println("Sorry, not enough water!")
                moneyIn -= 6
                waterIn += 200
                milkIn += 100
                coffeeIn += 12
                dispCups += 1
                println("")
                actionMenu()
            }
            if (milkIn < 0){
                println("Sorry, not enough milk!")
                moneyIn -= 6
                waterIn += 200
                milkIn += 100
                coffeeIn += 12
                dispCups += 1
                println("")
                actionMenu()

            }
            if (coffeeIn < 0){
                println("Sorry, not enough coffee beans!")
                moneyIn -= 6
                waterIn += 200
                milkIn += 100
                coffeeIn += 12
                dispCups += 1
                println("")
                actionMenu()
            }
            if (dispCups < 0) {
                println("Sorry, not enough disposable cups!")
                moneyIn -= 6
                waterIn += 200
                milkIn += 100
                coffeeIn += 12
                dispCups += 1
                println("")
                actionMenu()
            }
        }
        "back" -> {
            println("")
            actionMenu()
        }

    }

    list = mutableListOf<Int>(waterIn, milkIn, coffeeIn)
    println("I have enough resources, making you a coffee!")
    println()
  actionMenu()
}


class coffeeMachine () {

}