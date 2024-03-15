package com.example.kiosk

class BeverageMenu() : Menu() {

    override fun init() {
        menuContent = mutableListOf(
            "맥커피 아이스\t" to 3000,
            "맥커피 핫\t" to 2600,
            "콜라\t\t\t" to 1700,
            "제로콜라\t\t" to 1700,
            "사이다\t\t" to 1700,
            "제로사이다\t" to 1700,
            "환타오렌지\t" to 1700,
            "생수\t\t\t" to 1300
        )
    }

    override fun menuPrintAndInput() {
        println(
            """
            음료 메뉴입니다.
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