package com.example


fun main() {

    val world = "Актия"
    val playerName = "Алекс"
    val playerAge = 30
    var playerLives = 3
    var playerMoney = 6.2
    var isSavedGame = true
    var playerRice = "Humans"


    if (isSavedGame) {
        println("LoadGame...")
        println("StartGame..")
        playerLives = 3
    } else {
        println("StartNewGame")
    }


    if (playerRice == "Humans") {
        println("Раса игрока Люди")
    } else if (playerRice == "Ork") {
        println("Раса игрока Орки")
    } else if (playerRice == "Demons") {
        println("Раса игрока Демоны")
    }

    println("Мир $world")
    println("Игрок $playerName готов")
    println("Возраст: $playerAge")
    println("Жизни: $playerLives")
    println("Деньги: $playerMoney")


}