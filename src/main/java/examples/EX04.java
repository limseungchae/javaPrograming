package examples;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        // 11. 이름과 몸무게, 나이를 변수로 선언하고 자신의 것을 값으로 초기화하는
        // 프로그램을 작성하여라 (MyInfo)
        // String name = "홍길동";
        // double weight = 45.5;
        // int age = 28;
        Scanner sc = new Scanner(System.in);

        System.out.println("이름은?");
        String name = sc.next();

        System.out.println("몸무게는?");
        double weight = sc.nextDouble();

        System.out.println("나이는?");
        int age = sc.nextInt();

        String fmt = "이름 :%s, 몸무게 : %.1fkg, 나이 : %d\n";
        System.out.printf(fmt, name,weight,age);

        // 12. 생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라. (MyAge)
        System.out.println("생년은? ");
        int byear = sc.nextInt();

        System.out.println("생월은? ");
        int bmonth = sc.nextInt();

        System.out.println("생일은? ");
        int bday = sc.nextInt();

        int cyear = 2023, cmonth = 4, cday = 3;

        // 1) 현재년도에서 생냔을 빼서 나이 계산
        age = cyear - byear;

        // 2) 생일이 지났으면 나이 + 1 해줌
        age = (bmonth > cmonth && bday > cday) ? age += 1 : age;

        fmt = "입력하신 생일 : %d-%02d-%02d\n";
        fmt += "현재년도 생일 : %d-%02d-%02d\n";
        fmt += "나이 : %d 세\n";
        System.out.printf(fmt, byear, bmonth, bday,
                cyear, cmonth, cday, age);


        // 13. 구구단 중 7단을 출력하는 프로그램을 작성하여라. (GuGu7Dan)
        // System.out.println("7 x 1 =" + (7 * 1));
        // System.out.println("7 x 2 =" + (7 * 2));
        // System.out.println("7 x 3 =" + (7 * 3));
        // System.out.println("7 x 4 =" + (7 * 4));
        // System.out.println("7 x 5 =" + (7 * 5));
        // System.out.println("7 x 6 =" + (7 * 6));
        // System.out.println("7 x 7 =" + (7 * 7));
        // System.out.println("7 x 8 =" + (7 * 8));
        // System.out.println("7 x 9 =" + (7 * 9));

        // String dan7 = "7 x 1 =" + (7 * 1);
        // dan7 += "\n7 x 2 =" + (7 * 2);
        // dan7 += "\n7 x 3 =" + (7 * 3);
        // dan7 += "\n7 x 4 =" + (7 * 4);
        // dan7 += "\n7 x 5 =" + (7 * 5);
        // dan7 += "\n7 x 6 =" + (7 * 6);
        // dan7 += "\n7 x 7 =" + (7 * 7);
        // dan7 += "\n7 x 8 =" + (7 * 8);
        // dan7 += "\n7 x 9 =" + (7 * 9);

        // System.out.println(dan7);

        int dan = 7;

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }

        //  14. 다음 조건을 만족하는 프로그램을 작성하여라 (TimeTime)

        // 하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
        // 한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
        // 일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.

        int daysec = 86400;
        int data1 = 1234567890;
        int hour = 3600;
        int data2 = 98765;
        int min = 60;
        int data3 = 12345;

        fmt = "하루는 %,d초, %,d 초는 %,d 일 이다 \n";
        System.out.printf(fmt, daysec, data1, data1 / daysec);

        fmt = "1시간은 %,d초, %,d 초는 %,d 시간 이다 \n";
        System.out.printf(fmt, hour, data2, data2 / hour);

        fmt = "1분은 %,d초, %,d 초는 %,d 분 이다 \n";
        System.out.printf(fmt, min, data3, data3 / min);

    }
}
