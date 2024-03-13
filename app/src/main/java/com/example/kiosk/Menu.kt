package com.example.kiosk

open class Menu(menuNum: Int) {

    open var menuMap = mutableMapOf<String, Int>()

    companion object {
        var menuNum = 0
    }

    open fun menuPrint () {
        println("")
    }
    open fun paymentMenu () {
        println("")
    }
}