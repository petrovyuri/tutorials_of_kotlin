package com.example


fun main() {
    val world = "Актия"
    val playerName = "Алекс"
    val playerAge = 30
    var playerLives = 3
    var playerMoney = 6.2
    var isSavedGame = true
    var playerRice = "Humans"

    playerLives = checkSavedGame(isSavedGame, playerLives)

    printRacePlayer(playerRice)

    printPlayer(world, playerName, playerAge, playerLives, playerMoney)
}

 fun checkSavedGame(isSavedGame: Boolean, playerLives: Int): Int {
    var playerLives1 = playerLives
    if (isSavedGame) {
        println("LoadGame...")
        println("StartGame..")
        playerLives1 = 3
    } else {
        println("StartNewGame")
    }
    return playerLives1
}

private fun printRacePlayer(playerRice: String) {
    when (playerRice) {
        "Humans" -> println("Раса игрока Люди")
        "Ork" -> println("Раса игрока Орки")
        "Demons" -> println("Раса игрока Демоны")
    }
}

fun printPlayer(
    world: String,
    playerName: String,
    playerAge: Int,
    playerLives: Int,
    playerMoney: Double
) {
    println("Мир $world")
    println("Игрок $playerName готов")
    println("Возраст: $playerAge")
    println("Жизни: $playerLives")
    println("Деньги: $playerMoney")
}