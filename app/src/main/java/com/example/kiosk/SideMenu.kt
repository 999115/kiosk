package com.example.kiosk

class SideMenu() : Menu() {

    override fun init() {
        menuContent = mutableListOf(
            "감자튀김\t\t\t" to 2200,
            "치즈스틱\t\t\t" to 2500,
            "콘샐러드\t\t\t" to 1900,
            "맥너겟\t\t\t" to 3800,
            "아이스크림콘\t\t" to 1100,
            "초코아이스크림콘\t" to 1500
        )
    }

    override fun menuPrintAndInput() {
        println(
            """
            사이드 & 디저트 메뉴입니다.
            원하는 메뉴를 선택해 번호를 입력해주세요.
        """.trimIndent()
        )
        for (i in menuContent.indices) {
            println("${i + 1} | ${menuContent[i].first}| ${menuContent[i].second}원")
        }
        println("0 | 이전")

        while (true) {
            try {
                menuNum2 = readLine()!!.toInt()
                when (menuNum2 - 1) {
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