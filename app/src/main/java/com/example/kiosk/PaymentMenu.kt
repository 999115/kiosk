package com.example.kiosk

class PaymentMenu() : Menu() {
    override fun menuPrintAndInput() {
        price = menuContent[menuNum2 - 1].second!!

        println(
            """
            결제메뉴입니다.
            선택한 메뉴 : ${menuContent[menuNum2 - 1].first.trim()}
            결제할 금액 : ${price}원
            현재 잔액 : ${money}원
            원하는 메뉴를 선택해 번호를 입력해주세요.
            1 | 결제
            2 | 장바구니에 넣고 주문 계속하기
            0 | 처음으로
        """.trimIndent()
        )

        while (true) {
            try {
                menuNum3 = readLine()!!.toInt()
                when (menuNum3) {
                    in 0..2 -> break
                    else -> println("0부터 2까지의 숫자만 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }

    override fun pay() {

        var checkTime = Pair(0, (0..23))

        if ((nowTime.first == checkTime.first) && (nowTime.second in checkTime.second)) {
            println("은행 점검시간입니다. 결제가 실패하였습니다.")
            println("처음 화면으로 돌아갑니다.")
        } else if (money >= price) {
            money -= price
            println("결제가 완료되었습니다.")
            println("현재 잔액 : ${money}원")
        }else {
            println("잔액이 부족하여 결제가 실패하였습니다.")
            println("처음 화면으로 돌아갑니다.")
        }
    }

}