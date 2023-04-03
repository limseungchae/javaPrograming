package seung;

public class C02Operater {
    public static void main(String[] args) {
        // 표현expression : 리터럴(값), 식별자(변수), 연산자, 함수 호출등의 조합
        // 연산자 : 하나 이상의 표현식을 대상으로 산술,할당,비교,논리,타입 연산을
        //          하나 값을 만드는 기호를 의미

        // 산술연산자
        int x = 10, y = 20;

        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x, y, x*y);
        System.out.printf("%d / %d = %d\n", x, y, x/y);
        System.out.printf("%d %% %d = %d\n", y, x, x%y);

        // 관겨연산자
        System.out.printf("%d가 %d보다 크나요? %b\n",
                x, y, x > y);
        System.out.printf("%d가 %d보다 작나요? %b\n",
                x, y, x < y);
        System.out.printf("%d가 %d보다 같나요? %b\n",
                x, y, x == y);

        // 논리연산자
        System.out.printf("x < 10 AND x < 20 : %b\n",
                x < 10 && x < 20);
        System.out.printf("x < 10 OR x < 20 : %b\n",
                x < 10 || x < 20);
        System.out.printf("NOT (x < 10 AND x < 20) : %b\n",
                !(x < 10 && x < 20));

        // 🤚 : 자바에선 안되는 것!
        // System.out.printf("1 + true : %b", 1 + true);
        // System.out.printf("false + true : %b", false + true);

        // 할당 연산자 : syntatic sugar
        System.out.printf("x값은 %d\n", x);

        x += 2; // x = x + 2;
        System.out.printf("x + 2 = %d\n", x);

        x *= 2; // x = x * 2;
        System.out.printf("x * 2 = %d\n", x);

        x -= 2; // x = x - 2;
        System.out.printf("x - 2 = %d\n", x);

        // 증가, 감소 연산자
        x = 10;
        System.out.printf("++x +1 = %d\n", ++x + 1);

        x = 10;
        System.out.printf("x++ +1 = %d\n", x++ + 1);

        x = 10;
        System.out.printf("--x +1 = %d\n", --x + 1);

        x = 10;
        System.out.printf("x-- +1 = %d\n", x-- + 1);


        // 문자열 연산 : +
        //printf 메서드를 사용할 것을 추천!
        String name = "홍길동";

        System.out.println("나의 이름은 : " + name);
        System.out.printf("나의 이름은 : %s\n",name);


        // 삼향 연산자 : if 문의 syntatic sugar
        // 조건식 ? 참일때값 : 거짓일때값

        // ex) 평균점수가 60이상이면 '합격',
        // 아니면 '불합격'이라 출력
        double jumsu = 68.5;

        String result = jumsu >= 60 ? "합격" : "불합격";

        String fmt = "평균점수가 %.1f 결과는 %s 입니다 \n";
        System.out.printf(fmt, jumsu, result);
    }
}
