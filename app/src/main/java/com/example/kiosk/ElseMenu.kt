package com.example.kiosk

class ElseMenu(menuNum: Int) : Menu(menuNum) {

    override fun menuPrint() {
        println("잘못된 입력입니다.")
//        println("원하는 메뉴를 선택해 번호를 입력해주세요.")
    }
}