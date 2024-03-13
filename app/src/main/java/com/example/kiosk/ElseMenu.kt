package com.example.kiosk

class ElseMenu(menuNum: Int) : Menu(menuNum) {

    override fun foodMenuPrint() {
        println("잘못된 입력입니다. 0부터 4까지의 숫자만 입력해주세요.")
    }

    fun beforeMenuPrint() {

    }
}