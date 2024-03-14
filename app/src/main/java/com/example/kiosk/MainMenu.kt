package com.example.kiosk

class MainMenu() : Menu() {

    override fun menuPrintAndInput() {

        println("""
            원하는 메뉴를 선택해 번호를 입력해주세요.
            1 | 햄버거
            2 | 음료
            3 | 사이드 & 디저트
            4 | 이벤트 메뉴
            5 | 장바구니 확인
            6 | 결제 완료 (결제한 메뉴가 있다면 눌러주세요)
            0 | 키오스크 종료 (결제 후 입력 시 주문 접수가 안됩니다)
        """.trimIndent())

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