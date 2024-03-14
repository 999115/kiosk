package com.example.kiosk

class BugerMenu(menuNum: Int) : Menu(menuNum) {

    var menuName = mutableListOf<String>(
        "더블 쿼터파운더 치즈 버거\t",
        "빅맥 버거\t\t\t\t",
        "맥크리스피 버거\t\t\t",
        "맥치킨 버거\t\t\t\t",
        "1955 버거\t\t\t\t",
        "베이컨 토마토 디럭스 버거\t",
        "불고기 버거\t\t\t\t"
    )

    var menuPrice = mutableMapOf<String, Int>(
        menuName[0] to 7400,
        menuName[1] to 5500,
        menuName[2] to 6800,
        menuName[3] to 3500,
        menuName[4] to 6400,
        menuName[5] to 5800,
        menuName[6] to 3100
    )

    override fun foodMenuPrint() {
        println("햄버거 메뉴입니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        for (i in menuName.indices) {
            println("${i + 1} | ${menuName[i]}| ${menuPrice[menuName[i]]}원")
        }
        println("0 | 이전")

        while (true) {
            try {
                menuNum = readLine()!!.toInt()
                when (menuNum) {
                    in menuName.indices -> break
                    else -> println("0부터 ${menuName.size}까지의 숫자만 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }

    override fun paymentMenuPrint() {
        println("결제메뉴입니다.")
        println("현재 잔액 \t: 원")
        println("결제할 금액 \t: ${menuPrice[menuName[menuNum - 1]]}원")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 결제")
        println("2 | 장바구니에 넣고 주문 계속하기")
        println("0 | 이전")

        while (true) {
            try {
                menuNum = readLine()!!.toInt()
                when (menuNum) {
                    in 1..2 -> break
                    0 -> println("미구현 기능입니다.")
                    else -> println("0부터 2까지의 숫자만 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }
}