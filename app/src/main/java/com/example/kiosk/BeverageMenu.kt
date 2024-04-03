package com.example.kiosk

class BeverageMenu(menuNum: Int) : Menu(menuNum) {

    override fun menuPrint() {
        println("음료 메뉴입니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 맥커피 아이스")
        println("2 | 맥커피 핫")
        println("3 | 콜라")
        println("4 | 제로콜라")
        println("5 | 사이다")
        println("6 | 제로사이다")
        println("7 | 환타오렌지")
        println("8 | 생수")
        println("9 | 이전")

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