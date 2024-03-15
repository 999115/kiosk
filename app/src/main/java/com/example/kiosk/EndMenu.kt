package com.example.kiosk

import android.util.Range
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

class EndMenu : Menu() {
    override fun menuPrintAndInput() {
        var orderNum = (100..500).random()
        var waitNum = orderNum + (0..10).random()

        thread(start = true) {
            runBlocking {
                launch {
                    delay(3000)

                    println("""
                        
                        주문이 완료되었습니다.
                        주문 대기 장소는 이쪽입니다.
                    """.trimIndent())

                    while (waitNum > orderNum) {
                        println("""
                    
                        대기번호 : ${waitNum}번
                        현재 주문번호 : ${orderNum}번
                        대기인수 : ${waitNum - orderNum}명
                        """.trimIndent()
                        )
                        orderNum++
                        runBlocking {
                            launch {
                                delay(2000)
                            }
                        }
                    }
                    println("\n주문하신 상품이 나왔습니다. 상품을 받아가세요.")

                }
            }
        }

    }

}