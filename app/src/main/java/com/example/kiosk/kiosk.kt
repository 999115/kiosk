package com.example.myapplication

import com.example.kiosk.BeverageMenu
import com.example.kiosk.BugerMenu
import com.example.kiosk.CartMenu
import com.example.kiosk.EndMenu
import com.example.kiosk.EventMenu
import com.example.kiosk.MainMenu
import com.example.kiosk.Menu.Companion.menuNum
import com.example.kiosk.Menu.Companion.money
import com.example.kiosk.Menu.Companion.price
import com.example.kiosk.PaymentMenu
import com.example.kiosk.SideMenu

fun main() {

    money = (10..500).random() * 100
    var userMoney = money
    var userTime = 0

    var mainMenu = MainMenu()
    var afterFoodMenu = PaymentMenu()
    var afterPay = EndMenu()

    println("맥버거에 오신 것을 환영합니다.")

    while (true) {
        mainMenu.menuPrintAndInput()

        var afterMainMenu = when (menuNum) {
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
                println("잘못된 입력입니다. 0부터 6까지의 숫자만 입력해주세요.")
                continue
            }
        }

        if (menuNum==5){
            afterMainMenu.menuPrintAndInput()
            afterMainMenu = PaymentMenu()
            if (menuNum == 1){
                afterMainMenu.pay()
            } else continue
            afterPay.menuPrintAndInput()
            break
        } else if (menuNum == 6) {
            afterMainMenu.menuPrintAndInput()
            break
        }

        afterMainMenu.init()
        afterMainMenu.menuPrintAndInput()
        if (menuNum == 0) continue

        afterFoodMenu.menuPrintAndInput()

        var payment = when (menuNum) {
            0 -> continue
            1 -> PaymentMenu()
            2 -> CartMenu()
            else -> {
                println("잘못된 입력입니다. 0부터 2까지의 숫자만 입력해주세요.")
                continue
            }
        }
        payment.pay()
    }

    println("감사합니다. 안녕히 가세요.")

}