package com.example.kiosk

class SideMenu(menuNum: Int) : Menu(menuNum) {

    override fun menuPrint() {
        println("사이드 & 디저트 메뉴입니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 감자튀김")
        println("2 | 치즈스틱")
        println("3 | 콘샐러드")
        println("4 | 맥너겟")
        println("5 | 아이스크림콘")
        println("6 | 초코아이스크림콘")
        println("7 | 이전")

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