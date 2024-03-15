package com.example.myapplication

import com.example.kiosk.BeverageMenu
import com.example.kiosk.BugerMenu
import com.example.kiosk.CartMenu
import com.example.kiosk.EndMenu
import com.example.kiosk.EventMenu
import com.example.kiosk.MainMenu
import com.example.kiosk.Menu.Companion.menuNum1
import com.example.kiosk.Menu.Companion.menuNum2
import com.example.kiosk.Menu.Companion.menuNum3
import com.example.kiosk.Menu.Companion.money
import com.example.kiosk.Menu.Companion.price
import com.example.kiosk.PaymentMenu
import com.example.kiosk.SideMenu

fun main() {

    money = (10..500).random() * 100
    var userMoney = money

    println("맥버거에 오신 것을 환영합니다.")

    while (true) {

        var mainMenu = MainMenu()
        mainMenu.menuPrintAndInput()

        var afterMainMenu = when (menuNum1) {
            1 -> BugerMenu()
            2 -> BeverageMenu()
            3 -> SideMenu()
            4 -> EventMenu()
            5 -> if (price == 0) {
                println("장바구니에 추가된 상품이 없습니다. 처음 화면으로 돌아갑니다.")
                continue
            } else CartMenu()

            6 -> if (userMoney == money) {
                println("결제된 금액이 없습니다. 처음 화면으로 돌아갑니다.")
                continue
            } else EndMenu()

            0 -> if (userMoney != money) {
                println("결제된 금액이 있습니다. 결제 완료를 눌러주세요.")
                continue
            } else break

            else -> {
                println("0부터 6까지의 숫자만 입력해주세요.")
                continue
            }
        }
        afterMainMenu.init()
        afterMainMenu.menuPrintAndInput()
        if (menuNum2 == 0) continue

        var afterFoodMenu = PaymentMenu()
        var afterPay = EndMenu()
        when (menuNum1) {
            5 -> {
                afterFoodMenu.pay()
                afterPay.menuPrintAndInput()
                break
            }

            6 -> break
        }

        afterFoodMenu.menuPrintAndInput()

        var payment = when (menuNum3) {
            0 -> continue
            1 -> PaymentMenu()
            2 -> CartMenu()
            else -> {
                println("0부터 2까지의 숫자만 입력해주세요.")
                continue
            }
        }
        payment.pay()
    }

    println("감사합니다. 안녕히 가세요.")

}