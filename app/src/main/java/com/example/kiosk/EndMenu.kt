package com.example.kiosk

import android.util.Range

class EndMenu : Menu() {
    override fun menuPrintAndInput() {
        var orderNum = (100..500).random()
        var waitNum = orderNum + (0..20).random()
        println(
            """
            주문이 완료되었습니다.
            대기번호 : ${waitNum}번
            현재 주문번호 : ${orderNum}번
            대기인수 : ${waitNum - orderNum}명
        """.trimIndent()
        )

    }

}