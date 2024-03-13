package com.example.kiosk

class EventMenu(menuNum: Int) : Menu(menuNum) {

    var menuIndex = mutableListOf<String>(
        "핫케이크\t\t",
        "맥머핀\t\t",
        "스낵랩\t\t",
        "오늘의 버거\t"
    )

    override var menuMap = mutableMapOf<String, Int>(
        menuIndex[0] to 2800,
        menuIndex[1] to 3400,
        menuIndex[2] to 3000,
        menuIndex[3] to 8500
    )

    override fun menuPrint() {
        println("이벤트 메뉴입니다.")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        for (i in menuIndex.indices) {
            println("${i + 1} | ${menuIndex[i]}| ${menuMap[menuIndex[i]]}원")
        }
        println("${menuIndex.size + 1} | 이전")

        while (true) {
            try {
                menuNum = readLine()!!.toInt()
                when (menuNum-1) {
                    in menuIndex.indices -> break
                    menuIndex.size -> println("미구현 기능입니다.")
                    else -> println("1부터 ${menuIndex.size + 1}까지의 숫자만 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }

    override fun paymentMenu() {
        println("결제메뉴입니다.")
        println("현재 잔액 \t: 원")
        println("결제할 금액 \t: ${menuMap[menuIndex[menuNum - 1]]}원")
        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
        println("1 | 결제")
        println("2 | 장바구니에 넣고 주문 계속하기")
        println("3 | 이전")

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