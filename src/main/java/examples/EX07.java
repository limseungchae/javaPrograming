package examples;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // Q51 - 구구단 BigGugudan
        System.out.println("        Multiplication Table");
        System.out.println("      1   2   3   4   5   6   7   8   9");
        System.out.println("---------------------------------------");
        System.out.println("1 |   1   2   3   4   5   6   7   8   9");
        System.out.println("2 |   2   4   6   8  10  12  14  16  18");
        System.out.println("3 |   3   6   9  12  15  18  21  24  27");
        System.out.println("4 |   4   8  12  16  20  24  28  32  36");
        System.out.println("5 |   5  10  15  20  25  30  35  40  45");
        System.out.println("6 |   6  12  18  24  30  36  42  48  54");
        System.out.println("7 |   7  14  21  28  35  42  49  56  63");
        System.out.println("8 |   8  16  24  32  40  48  56  64  72");
        System.out.println("9 |   9  18  27  36  45  54  63  72  81");
        System.out.println();


        System.out.println("        Multiplication Table");
        System.out.println("      1   2   3   4   5   6   7   8   9");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d\t", i * j);
            }
            System.out.println("");
        }


        // Q 53 - 다음의 공식을 이용해서 입력한 년도의
        // 1월 달력을 출력하는 프로그램을 작성하시오.

        // ((년도 - 1)*365 + (년도 - 1)/4 - (년도 - 1)/100 +
        // (년도 - 1)/400 + 1) % 7
        // 0: 일, 1:월, 2:화, ... ... , 6:토
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();
        sc.close();

        int day = ((year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 + 1) % 7;

        System.out.println(year + "년 1월 달력");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i < day; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= 31; i++) {
            System.out.print(i + "\t");
            day++;
            if (day % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("");

        // Q55 - 주민번호 유효성 검사 JuminCode
        // int[] jumin = {1,2,3,4,5,6, 1,2,3,4,5,6,7};
        int[] jumin = {1, 2, 3, 4, 5, 6, 1, 2, 2, 2, 3, 3, 1};
        int sum = 0;

        // 1) 2,3,4,5,6,7,8,9,2,3,4,5 가중치 곱합
        sum += jumin[0] * 2;
        sum += jumin[1] * 3;
        sum += jumin[2] * 4;
        sum += jumin[3] * 5;
        sum += jumin[4] * 6;
        sum += jumin[5] * 7;
        sum += jumin[6] * 8;
        sum += jumin[7] * 9;
        sum += jumin[8] * 2;
        sum += jumin[9] * 3;
        sum += jumin[10] * 4;
        sum += jumin[11] * 5;


        // 2) 누적합을 11로 나눈 나머지 구함
        int mod = sum % 11;

        // 3) 나머지에서 11을 뺸 값을 비교
        mod = 11 - mod;

        // 4) 주민번호 끝자리와 비교
        if (jumin[12] == mod)
            System.out.println("주민번호 일치!");
        else
            System.out.println("주민번호 불일치!");

        System.out.println("나머지 : " + mod);


        // v2
        int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};   // 가중치
        sum = 0;

        // 누적합 구합
        for (int i = 0; i < weight.length; i++) {
            sum += jumin[i] * weight[i];
        }

        // 나머지 구함
        mod = (11 - sum % 11) % 10;

        // 결과 확인
        String result = "주민번호 불일치!";
        if (jumin[12] == (mod % 10)) result = "주민번호 일치!";

        System.out.println(result + "/" + mod);

    }

}

