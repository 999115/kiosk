package com.example.kiosk

class SideMenu(menuNum: Int) : Menu(menuNum) {

    var menuIndex = mutableListOf<String>(
        "감자튀김\t\t\t",
        "치즈스틱\t\t\t",
        "콘샐러드\t\t\t",
        "맥너겟\t\t\t",
        "아이스크림콘\t\t",
        "초코아이스크림콘\t"
    )

    var menuMap = mutableMapOf<String, Int>(
        menuIndex[0] to 2200,
        menuIndex[1] to 2500,
        menuIndex[2] to 1900,
        menuIndex[3] to 3800,
        menuIndex[4] to 1100,
        menuIndex[5] to 1500
    )

    override fun foodMenuPrint() {
        println("사이드 & 디저트 메뉴입니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        for (i in menuIndex.indices) {
            println("${i + 1} | ${menuIndex[i]}| ${menuMap[menuIndex[i]]}원")
        }
        println("0 | 이전")

        while (true) {
            try {
                menuNum = readLine()!!.toInt()
                when (menuNum) {
                    in menuIndex.indices -> break
                    else -> println("0부터 ${menuIndex.size}까지의 숫자만 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }

    override fun paymentMenuPrint() {
        println("결제메뉴입니다.")
        println("현재 잔액 \t: 원")
        println("결제할 금액 \t: ${menuMap[menuIndex[menuNum - 1]]}원")
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