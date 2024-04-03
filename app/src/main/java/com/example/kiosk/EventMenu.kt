package com.example.kiosk

class EventMenu(menuNum: Int) : Menu(menuNum) {

    override fun menuPrint() {
        println("이벤트 메뉴입니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 핫케이크")
        println("2 | 맥머핀")
        println("3 | 스낵랩")
        println("4 | 트리플치즈 토마토 크러스트 버거")
        println("5 | 이전")

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