# 자바를 활용한 호텔 예약 프로그램 🏨

## 🚀 필수 요구사항
1. 호텔은 여러 객실, 보유 자산을 가지고 있다.
2. 객실은 객실 당 하루에 한 사람만 예약이 가능하다.
3. 객실은 크기, 숙박비를 가진다.
4. 예약은 객실, 고객의 이름, 고객의 전화번호, 예약 날짜를 가지고 있다.
     - 전화 번호 제한(XXX-XXXX-XXXX) 정규 표현식
     - 예약 날짜 (날짜는 ISO 8601 형식으로 조합된 UTC 날짜 및 시간)
5. 고객은 이름, 전화번호, 소지금을 가진다.
    - 고객 소지금보다 비싼 방은 예약 불가
6. 호텔은 모든 예약 목록을 조회 할 수 있다.
7. 고객은 자신의 예약 목록을 조회 할 수 있다.
8. 고객은 자신의 예약을 취소 할 수 있다.

<br>

## ➕ 추가 기능 구현
1. Guest / Manager 모드 선택 기능

```java
환영합니다. JAVA 호텔 입니다.

Mode 를 선택해주세요.
1. Guest Mode
2. Manager Mode
```

2. 로그인 및 회원가입 기능

```java
------------Guest Mode-------------
1. 로그인
2. 회원 가입
```

3. 고객 포인트 충전 및 환전 기능
```java
충전할 포인트를 입력해주세요.
1000000
-----------------------------------------
충전이 완료 되었습니다.
k님 현재 잔액: 1000000 ₩

-----------------------------------------

k님의 현재 포인트: 1000000 ₩ 입니다.

환전할 금액을 입력해주세요.
1000000
환전이 완료되었습니다.


```

4. 빈 객실 찾기 / 예약 찾기 / 오늘 객실 현황 기능
```java
매뉴를 선택해 주세요.
1. 빈객실 찾기.
2. 예약 찾기.
3. 오늘 객실 현황.

```
