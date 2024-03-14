<br>

# <center>※ 맥버거 키오스크 구현 ※</center>

<br>

---

## [필요한 기능]

### 1. 메인메뉴
[x]인삿말 및 메뉴 선택 안내
[x]음식 대분류 작성
[x]프로그램 종료
[x]다른 번호 입력 시 오류 메세지 출력

### 2. 세부메뉴
[x]메뉴 안내
[x]각 음식 대분류 별로 세부메뉴 작성 (가격 포함)
[x]이전 메뉴로 돌아가기
[x]오류 메세지

### 3. 결제메뉴
[x]선택한 음식의 가격과 잔액 출력
[x]결제 및 장바구니 기능으로 연결
[x]~~이전 메뉴로 돌아가기~~ 처음 화면으로 돌아가기
[x]오류 메세지

### 4. 결제기능
[x]소지 금액 랜덤 값으로 지정 후 결제 금액으로 차감
[x]잔액 부족할 시 결제 실패 메세지 입력 후 메뉴 재선택 요구
[x]잔액은 그대로 유지되도록 설계 (싱글턴 이용)

### 5. 장바구니 기능
[x]선택한 메뉴 저장해두는 cart list 생성
[x]메인 메뉴에서 접근
[x]장바구니 목록 - 각 금액과 총액, 잔액 출력
[]선택한 메뉴만 결제하는 기능

### 6. 주문 완료 후 안내사항
[]3초 딜레이 후 표출
[x]주문 대기번호 출력
[]랜덤 번호 줘서 대기번호 뜰 때까지 주문번호 출력
[]해당 대기번호 출력 시 주문완료 메세지와 함께 종료

<br>

---

## [클래스 다이어그램]
| Menu (부모클래스) | content |
| - | - |
| - menuName: MutableList | 전체 메뉴 리스트 선언 |
| - menuPrice: MutableMap | 전체 메뉴 리스트 선언 |
| + foodMenuPrint(): Unit | 메뉴 가격 출력 |

<br>

| MainMenu (자식클래스) | content |
| - | - |
| + MainMenuPrint(): Unit | 메인메뉴 출력 |

<br>

| BugerMenu (자식클래스) | content |
| - | - |
| - menuName: MutableList | Menu에서 buger만 받아옴 |
| - menuPrice: MutableMap | Menu에서 buger만 받아옴 |
| + foodMenuPrint(): Unit | 받아온 buger 출력 가능하게 작성 |

<br>

| BeverageMenu (자식클래스) | content |
| - | - |
| - menuName: MutableList | Menu에서 beverage만 받아옴 |
| - menuPrice: MutableMap | Menu에서 beverage만 받아옴 |
| + foodMenuPrint(): Unit | 받아온 beverage 출력 가능하게 작성 |
<br>

| SideMenu (자식클래스) | content |
| - | - |
| - menuName: MutableList | Menu에서 side만 받아옴 |
| - menuPrice: MutableMap | Menu에서 side만 받아옴 |
| + foodMenuPrint(): Unit | 받아온 side 출력 가능하게 작성 |
<br>

| EventMenu (자식클래스) | content |
| - | - |
| - menuName: MutableList | Menu에서 event만 받아옴 |
| - menuPrice: MutableMap | Menu에서 event만 받아옴 |
| + foodMenuPrint(): Unit | 받아온 event 출력 가능하게 작성 |

<br>

| PaymentMenu (자식클래스) | content |
| - | - |
| - money: Int | 사용자의 소지금액 받아옴 |
| - price: Int | 선택한 메뉴의 가격 받아옴 |
| + paymentMenuPrint(): Unit | 결제 메뉴 출력 |
| + payment(): Int | 금액 차감 후 차감 금액 반환 |

<br>

| CartMenu (자식클래스) | content |
| - | - |
| - cart: MutableList | 카트에 추가한 메뉴들 |
| - price: Int | 선택한 메뉴의 가격 받아옴 |
| + cartMenuPrint(): Unit | 장바구니 메뉴 출력 |

<br>

| EndMenu (자식클래스) | content |
| - | - |
| - orderNum: Int | 랜덤값으로 생성되는 주문번호 |
| - waitNum: Int | 사용자가 받은 대기번호 |
| + endMenuPrint(): Unit | 주문완료 후 대기메뉴 출력 |

<br>