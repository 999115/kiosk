package com.example.kiosk

class BugerMenu(menuNum: Int) : Menu(menuNum) {

    override fun menuPrint() {
        println("햄버거 메뉴입니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 쿼터파운더 치즈 버거")
        println("2 | 빅맥 버거")
        println("3 | 맥크리스피 버거")
        println("4 | 맥치킨 버거")
        println("5 | 1955 버거")
        println("6 | 베이컨 토마토 디럭스 버거")
        println("7 | 불고기 버거")
        println("8 | 이전")

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