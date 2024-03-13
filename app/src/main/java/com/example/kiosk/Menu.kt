package com.example.kiosk

open class Menu(menuNum: Int) {

    companion object {
        var menuNum = 0
    }

    open fun foodMenuPrint () {
        println("")
    }
    open fun paymentMenuPrint () {
        println("")
    }
}