package com.example.kiosk

open class Menu() {
    open fun init() {}
    open fun menuPrintAndInput() {}
    open fun pay() {}

    companion object {
        var menuNum1 = 0
        var menuNum2 = 0
        var menuNum3 = 0
        var menuContent = mutableListOf<Pair<String, Int>>()
        var money = 0
        var price = 0
        var cartContent = mutableListOf<Pair<String, Int>>()
        var nowTime = Pair((0..23).random(), (0..59).random())
    }
}