package com.example.kiosk

class MainMenu(menuNum: Int) : Menu(menuNum) {

    fun mainMenuPrint() {
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 햄버거")
        println("2 | 음료")
        println("3 | 사이드 & 디저트")
        println("4 | 이벤트 메뉴")
        println("0 | 종료")

        while (true) {
            try {
                menuNum = readLine()!!.toInt()
                break
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }

}