package com.example.kiosk

class BugerMenu() : Menu() {

    override fun init() {
        menuContent = mutableListOf(
            "더블 쿼터파운더 치즈 버거\t" to 7400,
            "빅맥 버거\t\t\t\t" to 5500,
            "맥크리스피 버거\t\t\t" to 6800,
            "맥치킨 버거\t\t\t\t" to 3500,
            "1955 버거\t\t\t\t" to 6400,
            "베이컨 토마토 디럭스 버거\t" to 5800,
            "불고기 버거\t\t\t\t" to 3100
        )
    }

    override fun menuPrintAndInput() {

        println("""
            햄버거 메뉴입니다.
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