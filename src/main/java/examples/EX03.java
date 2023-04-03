package examples;

public class EX03 {
    public static void main(String[] args) {
        // 7. 각 표현식에 대한 결과 값을 계산하여라. 만일 틀린 식이 있다면 수정하여라.

        // 가.  3 + 4.5 * 2 + 27 / 8
        // 우선순위 : *, /
        System.out.println(3 + 4.5 * 2 + 27 / 8);

        // 나.  true || false && 3 < 4 || !(5 == 7)
        // 우선수위 : !, && ||
        System.out.println(true || false && 3 < 4 || !(5 == 7));

        // 다.  true || (3 < 5 && 6 >= 2)
        // 우선수위 : (), && ||
        System.out.println(true || (3 < 5 && 6 >= 2));

        // 라.  !true > 'A'
        // 실행불가!
        // System.out.println(!true > (int)'A');

        // 단일문자가 수식에 사용되면 ascii 코드값으로 자동 형변환
        // Z : 90, D : 68, M : 77
        // System.out.println("z => "+ (0 + 'z'));

        // 마.  7 % 4 + 3 - 2 / 6 * 'Z'
        System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');

        // 바.  'D' + 1 + 'M' % 2 / 3
        System.out.println('D' + 1 + 'M' % 2 / 3);

        // 사.  5.0 / 3 + 3 / 3
        System.out.println(5.0 / 3 + 3 / 3);

        // 아.  53 % 21 < 45 / 18
        System.out.println(53 % 21 < 45 / 18);

        // 자.  (4 < 6) || true && false || false && (2 > 3)
        System.out.println((4 < 6) || true && false || false && (2 > 3));

        // 차.  7 - (3 + 8 * 6 + 3) - (2 + 5 * 2)
        System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));



        // 8. 다음의 자바 문장에 잘못된 부분이 있는지 알아보고,
        //     만약 올바르다면 출력결과를, 그렇지 않다면 그 이유를 서술하여라

        // print   : 괄호안의 문자열 출력
        // println : 괄호안의 문자열 출력후 줄바꿈 처리

        // 가.  System.out.print( " May 13, 1988 fell on day number ");
                System.out.print("May 13, 1988 fell on day number ");

        // 나.  System.out.println( ( (13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400
        //      - 2 * (1988 / 100) ) % 7 + 7) % 7 );
                System.out.println(((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400
                - 2 * (1988 / 100)) % 7 + 7) % 7);

        // 다.  System.out.print( " Check out this line  ");
                System.out.print("Check out this line  ");

        // 라.  System.out.println( " //hello there " + '9' + 7 );
                System.out.println("//hello there " + '9' + 7);

                // 단일문자가 수식에 사용되면 ascii 코드값으로 자동 형변환
                // H:72 , I: 73, T: 84
        // 마.  System.out.print( 'H' + 'I' + " is " + 1 + "more example" );
                System.out.println('H' + 'I' + " is " + 1 + " more example");

        // 바.  System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
                System.out.println("H" + 6.5 + 'I' + " is " + 1 + " more example");

        // 사.  System.out.print( "Print both of us", "Me too" );
                System.out.println("Print both of us" + "Me too");

                // 문자가 문자열과 + 연산시 문자결합 발생!
        // 아.  System.out.print( "Reverse " + 'I' + 'T' );
                System.out.println("Reverse " + 'I' + 'T');

        // 자.  System.out.print( "No! Here is" + 1 + "more example" );
                System.out.println("No! Here is " + 1 + " more example");

                // 10 * 10를 먼저 연산 후 문자열로 변환해서 문자결합
        // 차.  System.out.println( "Here is " + 10 * 10) ) // that’s 100 ;
                System.out.println("Here is " + 10 * 10);
                System.out.println("Reverse " + 'I' + 'T');

        // 카.  System.out.println( "Not x is " + true ); // that’s true.
                System.out.println("Not x is " + true);

        // 타.  System.out.print(  );
                System.out.println();

        // 파.  System.out.println;

        // 하.  System.out.print( "How about this one" ++ '?' + 'Huh?' );
                System.out.println("How about this one" + '?' + "Huh?");

        // 요일 계산
        System.out.print("\n Dec 25, 2023 fell on day number ");
        System.out.println(((25 + (25 * 2 - 1) / 12 + 2023 % 100 +
                2023 % 100 / 4 + 2023 / 400 - 2 * (2023 / 100)) % 7 + 7) % 7);


        // 9. 각 부울 표현식에 대한 값을 계산하여라. 자바는 단축식 평가
        // short-circuit evaluation을 사용한다는 점에 주의하여라.

        // 우선순위 : !, &&, ||
        // 단축식 평가 1 : and 연산시 한쪽이 Falsr면 더 볼꺼 없이 전체식의 결과는 False
        // 단축식 평가 2 : or 연산시 한쪽이 True면 더 볼꺼 없이 전체식의 결과는 True

        // 가.   true && false && true || true
        System.out.println(true && false && true || true);

        // 나.   true || true && true && false
        System.out.println(true || true && true && false);

        // 다.   (true && false) || (true && ! false) || (false && !false)
        System.out.println((true && false) || (true && ! false) || (false && !false));

        // 라.   (2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4
        System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);

        // 마.   6 == 9 || 5 < 6 && 8 < 4 || 4 > 3
        System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);













    }
}
