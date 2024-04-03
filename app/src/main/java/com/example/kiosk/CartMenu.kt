package com.example.kiosk

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

class CartMenu() : Menu() {

    override fun menuPrintAndInput() {

        println(
            """
            장바구니입니다.
            추가한 메뉴 : ${cartContent.map { it.first.trim() }}
            """.trimIndent()
        )
        for (i in cartContent.indices) {
            println("${i + 1} | ${cartContent[i].first.trim()} | ${cartContent[i].second}원")
        }
        println(
            """            
            총 결제할 금액 : ${price}원
            현재 잔액 : ${money}원
            
            결제하시겠습니까?
            1 | 예
            0 | 아니요 (처음 화면으로 돌아갑니다)
        """.trimIndent()
        )

        while (true) {
            try {
                menuNum2 = readLine()!!.toInt()
                when (menuNum2) {
                    in 0..1 -> break
                    else -> println("0부터 1까지의 숫자만 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자만 입력해주세요.")
            }
        }
    }

    override fun pay() {
        cartContent.add(Pair(menuContent[menuNum2 - 1].first, price))
        println("${menuContent[menuNum2 - 1].first.trim()}(을)를 장바구니에 추가하였습니다.")
        price = cartContent.map { it.second }.sum()
        println("처음 화면으로 돌아갑니다.")
    }

}