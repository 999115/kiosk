package com.example.kiosk

open class Menu() {
    open fun init() {}
    open fun menuPrintAndInput() {}
    open fun pay() {}

    companion object {
        var menuNum = 0
        var menuContent = mutableListOf<Pair<String, Int>>()
        var money = 0
        var price = 0
        var cartContent = mutableListOf<Pair<String, Int>>()
    }
}