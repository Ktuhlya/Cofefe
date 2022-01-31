package machine

enum class KindCoffee (val kind: String, val money: Int, val water:Int,
                       val milk:Int, val coffee: Int) {
    ESPRESSO("1", 4, 250, 0, 16),
    LATTE("2", 7, 350, 75, 20),
    CAPPUCCINO("3", 6, 200, 100, 12),
}

fun main() {

    actionMenu()

    }

fun actionMenu() {

    print("Write action (buy, fill, take, remaining, exit): ")
    when (readln()) {
        "buy" -> {
            coffeeMachine(state = MachineState.State.state ).buy()
        }
        "fill" -> {
            coffeeMachine(MachineState.State.state ).fillF()
        }
        "take" -> {
            coffeeMachine(MachineState.State.state ).takeF()
        }
        "remaining" -> {
            coffeeMachine(MachineState.State.state ).machineState()
        }
        "exit" -> System.exit(0)
    }

}


class  MachineState(var waterIn: Int, var milkIn: Int, var coffeeIn: Int,
                    var dispCups: Int, var moneyIn: Int){
    object State {
        var state: MachineState = MachineState(400, 540, 120, 9, 550)

    }
}


class coffeeMachine (var state : MachineState) {

    fun buy(){
        println("")
        print(
            "What do you want to buy? 1 - espresso, " + "2 - latte, " +
                    "3 - cappuccino, back - to main menu: "
        )
        var indCoffee = readln()
        if (indCoffee == "back") actionMenu()
        var kindCoffee: KindCoffee = KindCoffee.values()[indCoffee.toInt()-1]

        when {
            state.waterIn < kindCoffee.water -> println("Sorry, not enough water!")
            state.milkIn < kindCoffee.milk -> println("Sorry, not enough milk!")
            state.coffeeIn < kindCoffee.coffee -> println("Sorry, not coffee beans!")
             state.dispCups < 1 -> println("Sorry, not enough disposable cups!")
            else -> {
              state.waterIn = state.waterIn- kindCoffee.water
              state.coffeeIn = state.coffeeIn - kindCoffee.coffee
              state.milkIn = state.milkIn - kindCoffee.milk
              state.moneyIn = state.moneyIn + kindCoffee.money
               state.dispCups --
                println("I have enough resources, making you a coffee!")
                println()

            }
        }

        actionMenu()

    }

    fun fillF() {
        println("")
        print("Write how many ml of water do you want to add: ")
       state.waterIn += readln().toInt()
        print("Write how many ml of milk do you want to add: ")
        state.milkIn += readln().toInt()
        print("Write how many grams of coffee beans do you want to add: ")
        state.coffeeIn += readln().toInt()
        print("Write how many disposable cups of coffee " +
                "do you want to add: ")
        state.dispCups += readln().toInt()

        println("")
        actionMenu()
    }

    fun takeF() {
        println("")
        println("I gave you $${state.moneyIn}")
        state.moneyIn = 0

        println()
        actionMenu()
    }

    fun machineState() {

        println("")
        println("The coffee machine has:")
        println("${state.waterIn} of water")
        println("${state.milkIn} of milk")
        println("${state.coffeeIn} of coffee beans")
        println("${state.dispCups} of disposable cups")
        println("$${state.moneyIn} of money")
        println("")
        actionMenu()


    }
}



