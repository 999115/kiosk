package com.example.myapplication

import com.example.kiosk.BeverageMenu
import com.example.kiosk.BugerMenu
import com.example.kiosk.ElseMenu
import com.example.kiosk.EventMenu
import com.example.kiosk.MainMenu
import com.example.kiosk.Menu.Companion.menuNum
import com.example.kiosk.Payment
import com.example.kiosk.SideMenu

fun main() {

    var userMenu1 = 0
    var userMoney = (10..500).random() * 100
    var userTime = 0

    println("맥버거에 오신 것을 환영합니다.")

    while (true) {
        var mainMenu = MainMenu(userMenu1)
        mainMenu.mainMenuPrint()

        userMenu1 = menuNum

        var afterMain = when (userMenu1) {
            1 -> BugerMenu(userMenu1)
            2 -> BeverageMenu(userMenu1)
            3 -> SideMenu(userMenu1)
            4 -> EventMenu(userMenu1)
            0 -> break
            else -> ElseMenu(userMenu1)
        }

        afterMain.foodMenuPrint()
        if (menuNum == 0) continue
        afterMain.paymentMenuPrint()

        var payment = Payment(userMoney, cartPrice) //장바구니 가격을 가져오기
        payment.payment()

    }

    println("감사합니다. 안녕히 가세요.")

//    while (true) {
//
//        println("두번째 숫자를 입력해주세요.")
//        while (true) {
//            try {
//                userNum2 = readLine()!!.toDouble()
//                break
//            } catch (e: NumberFormatException) {
//                println("숫자만 입력해주세요.")
//            }
//        }
//
//        println("계산을 그만하려면 -1을, 아니라면 연산자를 입력해주세요.")
//        userOperator = readLine()!!
//
//        var content = when (userOperator) {
//            "-1" -> break
//            "+" -> AddOperation(userNum1, userOperator, userNum2)
//            "-" -> SubtractOperation(userNum1, userOperator, userNum2)
//            "*" -> MultiplyOperation(userNum1, userOperator, userNum2)
//            "/" -> DivideOperation(userNum1, userOperator, userNum2)
//            "%" -> OddOperation(userNum1, userOperator, userNum2)
//            else -> ElseOperation(userNum1, userOperator, userNum2)
//        }
//
//        content.calculate()
//
//        when (userOperator) {
//            "+" -> userNum1 = AddOperation(userNum1, userOperator, userNum2).result
//            "-" -> userNum1 = SubtractOperation(userNum1, userOperator, userNum2).result
//            "*" -> userNum1 = MultiplyOperation(userNum1, userOperator, userNum2).result
//            "/" -> userNum1 = DivideOperation(userNum1, userOperator, userNum2).result
//            "%" -> userNum1 = OddOperation(userNum1, userOperator, userNum2).result
//            else -> print("")
//        }
//    }
}
//
//
//open class Calculator(num1: Double, operator: String, num2: Double) {
//    var num1: Double = num1
//    var operator: String = operator
//    var num2: Double = num2
//    var result: Double = 0.0
//
//    init {
//        this.result = result
//    }
//
//    open fun calculate() {
//        println(result)
//    }
//
//}
//
//class AddOperation(num1: Double, operator: String, num2: Double) :
//    Calculator(num1, operator, num2) {
//    init {
//        result = num1 + num2
//    }
//
//    override fun calculate() {
////        super.calculate()
//        println(result)
//    }
//}
//
//class OddOperation(num1: Double, operator: String, num2: Double) :
//    Calculator(num1, operator, num2) {
//    init {
//        result = num1 % num2
//    }
//
//    override fun calculate() {
////        super.calculate()
//        if (num2 != 0.0) {
//            println(result)
//        } else {
//            println("0으로 나눌 수 없습니다.")
//        }
//    }
//}
//
//class ElseOperation(num1: Double, operator: String, num2: Double) :
//    Calculator(num1, operator, num2) {
//    init {
//        result = 0.0
//    }
//
//    override fun calculate() {
////        super.calculate()
//        println("잘못된 입력입니다. 두번째 숫자 입력을 초기화합니다.")
//    }
//}