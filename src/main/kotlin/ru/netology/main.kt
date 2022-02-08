package ru.netology

fun main() {
    val amount : Int = 50000
    val percentCommission : Int = 75
    val minCommission : Int = 3500

    val result = if ((amount * percentCommission / 1000) < minCommission) minCommission else amount * percentCommission / 1000
    println("Комиссия составляет: ${result / 100} руб. ${result % 100} коп.")
}