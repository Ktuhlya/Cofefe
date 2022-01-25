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



/*

  val list = mutableListOf<Int>()
    print("Write how many ml of water the coffee machine has: > ")
    val waterIn =list.add(readln().toInt() / 200)
    print("Write how many mj of milk the coffee machine has: > ")
    val milkIn = list.add(readln().toInt() / 50)
    print("Write how many grams of coffee beans the coffee machine has: > ")
    val coffeeIn = list.add(readln().toInt() / 15)
    print("Write how many cups of coffee you will need: > ")
    val cupsWanted = readln().toInt()
    val maxCupsIn = list.minOrNull()
   if (maxCupsIn!! < cupsWanted) {
       println("No, I can make only $maxCupsIn cups of coffee")
   }
    if (maxCupsIn == cupsWanted) {
        println("Yes, I can make that amount of coffee")
    }
    if (maxCupsIn > cupsWanted) {
        println("Yes, I can make that amount of coffee " +
                "(and even ${maxCupsIn - cupsWanted} more than that")


//////////

println("Write how many cups of coffee you will need: > ")
    val cups = readln().toInt()
    println("For $cup of coffee you will need:")
    println("${cup*200} ml of water" )
    println("${cup*50} ml of milk")
    println("${cup*15} g of coffee beans")
///
 println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!
    """.trimIndent()
    )



 */