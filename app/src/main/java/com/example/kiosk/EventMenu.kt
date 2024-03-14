package com.example.kiosk

class EventMenu() : Menu() {

    override fun init() {
        menuContent = mutableListOf(
            "핫케이크\t\t" to 2800,
            "맥머핀\t\t" to 3400,
            "스낵랩\t\t" to 3000,
            "오늘의 버거\t" to 8500
        )
    }

    override fun menuPrintAndInput() {
        println("""
            이벤트 메뉴입니다.
            원하는 메뉴를 선택해 번호를 입력해주세요.
        """.trimIndent())
        for (i in menuContent.indices) {
            println("${i + 1} | ${menuContent[i].first}| ${menuContent[i].second}원")
        }
        println("0 | 이전")

        while (true) {
            try {
                menuNum = readLine()!!.toInt()
                when (menuNum - 1) {
                    -1 -> break
                    in menuContent.indices -> break
                    else -> println("0부터 ${menuContent.size}까지의 숫자만 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }

}