package seung;

import java.util.Scanner;

public class J08Loop {
    public static void main(String[] args) {
        // while
        // 조건식이 참일 동안 코드블록을 생행하는 반복문
        // for는 반복 횟수를 처음부터 알고 있을때 실행하는 반복문인 반면,
        // while은 반복 횟수를 모르고 실행하는 반복문임
        // 1부터 ~ 10까지 정수 출력 v3
        int i = 1;          // 초기화식
        while (i <= 10) {    // 조건식
            System.out.println(i + " ");
            ++i;            // 증감식
        }

        // 1부터 100사이 짝수 출력 v1
        i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i + " ");
            ++i;
        }

        // 1부터 100사이 짝수 출력 v2
        i = 2;
        while (i <= 100) {
            System.out.println(i + " ");
            i += 2;
        }

        // 1 ~ 100까지의 정수의 총합 출력 v2
        i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            ++i;
        }
        System.out.println(sum);

        // 1 ~ 100 까지 홀수와 총합 출력 v1
        i = 1;
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.println(i + " ");
            ++i;
        }
        System.out.println(sum);


        // 1 ~ 100 까지 홀수와 총합 출력 v2
        i = 1;
        sum = 0;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);


        // 구구단 출력 v3
        int dan = 2;

        i = 1;
        String fmt = "%2d단 x %2d = %2d\n";
        while (i <= 9) {
            System.out.printf(fmt, dan, i, dan * i);
            ++i;
        }

        // 무한 반복문
        // 반복문의 조건식을 true라고 설정하면
        // 해당 반복문을 무한 실행함

        // 임의의 정수를 계속 입력하면
        // 입력한 정수의 합을 계산함
        // 단, 0을 입력하면 실행을 중지하고
        // 지금까지의 총합을 출력
        // 옵션 : 입력한 모든 정수도 같이 화면에 출력

        Scanner sc = new Scanner(System.in);

        int[] vals = new int[100];
        sum = 0;
        int idx = 0;   // 배열 인덱스

        while (true) {
            System.out.println("값은? ");
            vals[idx] = sc.nextInt();
            if (vals[idx] == 0) {    // 입력값이 0이면 반복중지!
                break;
            }
            sum += vals[idx];
            idx++;
        }

        System.out.printf("총합 : %d\n", sum);
        for (int val : vals) {
            if (val != 0) {
                System.out.print(val + " ");
            }
        }


    }
}
