첫번째 과제 : 주사위게임

2명의 플레이어가 주사위를 각각 5번씩 번갈아 던져서 주사위 눈금의 총합이 높은 플레이어가 승자가 되는 프로그램입니다.
아래에 요구사항에 근거하여 프로그램을 작성해주세요.

1. 주사위(Dice, FraudDice)

주사위를 던지면 1~6 사이의 정수가 랜덤하게 나옵니다.
주사위는 아무 특징이 없는 일반 '주사위'와 '사기주사위'가 있습니다. 2종류입니다.
사기주사위에는 레벨을 정할 수 있습니다. 일반모드, 약함모드, 강함모드
사기주사위의 특징입니다
일반모드 : 보통 주사위와 동일합니다.
약함모드 : 5이상의 눈금이 나오면 다시 던집니다.
강함모드 : 2이하의 눈금이 나오면 다시 던집니다.
2. 플레이어(Player, FraudPlayer)

플레이어는 이름을 정할수 있고, 주사위를 들고 있습니다. 또한 본인의 합계득점을 기억합니다.
플레이어도 일반 '플레이어'가 있으며, 사기주사위를 사용하는 '사기플레이어'가 있습니다.
사기플레이어는 지고 있을 경우 얍삽하게도 사기주사위의 레벨을 높입니다(강함모드).
6점 이상 차이로 이기고 있는 경우엔 거만해져서 사기주사위의 레벨을 낮춥니다(약함모드).
위의 경우가 아닌 경우 일반모드로 플레이합니다.
3. 심판(Judge)

심판을 통해 선수등록을 할 수 있습니다.
심판을 통해 게임을 진행합니다. 주사위를 서로 몇번 던질것인지에 대해 지정할 수 있습니다.
심판은 기록원을 통해서 매 라운드마다 주사위 총합을 기록(출력)할 수 있으며, 모든 라운드가 종료되면 승자를 판정합니다.
4. 기록원(Recorder)

기록원은 게임의 진행상황과 결과를 기록하는 역할을 담당합니다.
기록은 System.out.println(); 으로 처리합니다.
두가지를 기록할 수 있습니다.
모든 플레이어의 스코어를 기록하며, 사기주사위를 쓰는 플레이어의 경우 주사위의 상태까지 보여줍니다.
ex)
[ 최강훈:6[NORMAL] 김준하:6 ]
[ 최강훈:8[NORMAL] 김준하:10 ]
[ 최강훈:13[STRONG] 김준하:14 ]
[ 최강훈:16[STRONG] 김준하:17 ]
[ 최강훈:21[STRONG] 김준하:23 ]

승자를 기록합니다.

ex)
김준하가 승리했습니다!

5. 메인(GameMain)

메인메소드가 존재하며 여기서 프로그램이 실행됩니다.
플레이어의 이름을 정할 수 있습니다.
주사위는 5번 던지는것으로 하겠습니다.
요구사항

클래스이름은 위 설명에서 괄호안의 이름을 사용하면 됩니다.
패키지를 꼭 구분하여 작성해 주세요.
배열은 사용하지 않습니다. 컬렉션 프레임워크(List 또는 Map)를 사용해주세요.
어떤메소드든 10줄이상 넘어가지 않도록 작성해주세요.
