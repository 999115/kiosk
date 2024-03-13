package com.example.kiosk

class Payment(money: Int, price: Int) {
    var money = money
    var price = price
    fun payment() {
        if (money >= price) {
            println("결제가 완료되었습니다.")
            println("현재 잔액 : 원")
            money -= price
//            cart.add("") //장바구니에 추가
        } else{
            println("잔액이 부족하여 결제가 실패하였습니다.")
            println("키오스크가 종료됩니다.")
        }
    }

}