package com.example


fun main() {

    var playerName = "Алекс"
    var playerAge = 30
    var playerLives = 3
    var playerMoney = 6.2
    var playerPower = 5
    val world = "Актия"
    var isSavedGame = true
    var playerRice = "Human"



    if (isSavedGame) {
        println("LoadGame...")
        println("StartGame..")
    } else {
        println("StartNewGame")
    }


    println("Мир $world")


    if (playerRice == "Human") {
        println("Раса игрока человек")
        playerName = "Alex"
        playerAge = 30
        playerLives = 6
        playerMoney = 20.5
        playerPower = 10
        println("Игрок $playerName готов")
        println("Возраст: $playerAge")
        println("Жизни: $playerLives")
        println("Деньги: $playerMoney")

    } else if (playerRice == "Ork") {
        println("Раса игрока орк")
        playerName = "Jodi"
        playerAge = 120
        playerLives = 5
        playerMoney = 2.3
        playerPower = 20
        println("Игрок $playerName готов")
        println("Возраст: $playerAge")
        println("Жизни: $playerLives")
        println("Деньги: $playerMoney")
    } else {
        println("Раса игрока дракон")
        playerName = "Tran"
        playerAge = 650
        playerLives = 2
        playerMoney = 9.0
        playerPower = 60
        println("Игрок $playerName готов")
        println("Возраст: $playerAge")
        println("Жизни: $playerLives")
        println("Деньги: $playerMoney")
    }


}