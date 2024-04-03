package com.example.kiosk

class MainMenu(menuNum: Int) : Menu(menuNum) {

    fun mainMenuPrint() {
        println("맥버거에 오신 것을 환영합니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 햄버거")
        println("2 | 음료")
        println("3 | 사이드 & 디저트")
        println("4 | 이벤트 메뉴")
        println("5 | 종료")

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