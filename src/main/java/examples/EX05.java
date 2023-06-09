package examples;

import java.io.IOException;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) throws IOException {
        // Q27 - LeapYear
        // 특정년도에 윤년여부를 출력
        // 조건1 : 4로 나눠 떨어지고, 100으로는 나눠 떨어지지 않으면 윤년
        // 조건2 : 400으로 나눠 떨어지면 윤년

        // ex) 1988, 2000, 2008, 2020 : 윤년
        //     1900, 2100, 2022 : 평년
        Scanner sc = new Scanner(System.in);
        System.out.print("년도는? ");
        int year = sc.nextInt();
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("윤년입니다.");
        }
        else {
            System.out.println("평년입니다.");
        }

        // Q16 - Charge
        System.out.print("계산할 금액은? ");
        int pay = sc.nextInt();
        System.out.print("지불 금액은? ");
        int money = sc.nextInt();

        int change = money - pay;
        int w50000 = 0;
        int w10000 = 0;
        int w5000 = 0;
        int w1000 = 0;
        int w500 = 0;
        int w100 = 0;
        int w50 = 0;
        int w10 = 0;

        w50000 = change / 50000;
        change %= 50000;

        w10000 = change / 10000;
        change %= 10000;

        w5000 = change / 5000;
        change %= 5000;

        w1000 = change / 1000;
        change %= 1000;

        w500 = change / 500;
        change %= 500;

        w100 = change / 100;
        change %= 100;

        w50 = change / 50;
        change %= 50;

        w10 = change / 10;
        change %= 10;

        System.out.printf("계산할 금액 : %d 장\n", pay);
        System.out.printf("지불 금액 : %d 장\n", money);
        System.out.printf("지급 금액 : %d 장\n", money-pay);
        System.out.println("----------------------");
        System.out.printf("50000원권 : %d 장\n", w50000);
        System.out.printf("10000원권 : %d 장\n", w10000);
        System.out.printf("5000원권 : %d 장\n", w5000);
        System.out.printf("1000원권 : %d 장\n", w1000);
        System.out.printf("500원 : %d 개\n", w500);
        System.out.printf("100원 : %d 개\n", w100);
        System.out.printf("50원 : %d 개\n", w50);
        System.out.printf("10원 : %d 개\n", w10);

        // Q26 - Tax
        // 가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%
        // 나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%
        System.out.print("결혼여부는? (y/n)");
        String isMarried = sc.next();
        System.out.println("연봉은? ");
        int salary = sc.nextInt();

        double tax = 0;
        switch (isMarried) {
            case "y" : case  "Y" :
                if (salary < 6000) tax = salary * 0.15;
                else tax = salary * 0.35;
                break;
            case "n" : case  "N" :
                if (salary < 3000) tax = salary * 0.1;
                else tax = salary * 0.25;
                break;
        }

        String fmt = "결혼여부 : %s, 연봉: %d, 세금 : %.1f\n";
        System.out.printf(fmt, isMarried, salary, tax);


        // Q28 -GUGDAN
        System.out.print("구구단의 단은? ");
        int dan = sc.nextInt();

        String result = "";
        if (dan >= 1 && dan <=9 ) {
            //result += dan + " x 1 = " + dan * 1 + "\n",
            result += String.format("%d x 1 = %d\n", dan, dan * 1);
            result += String.format("%d x 2 = %d\n", dan, dan * 2);
            result += String.format("%d x 3 = %d\n", dan, dan * 3);
            result += String.format("%d x 4 = %d\n", dan, dan * 4);
            result += String.format("%d x 5 = %d\n", dan, dan * 5);
            result += String.format("%d x 6 = %d\n", dan, dan * 6);
            result += String.format("%d x 7 = %d\n", dan, dan * 7);
            result += String.format("%d x 8 = %d\n", dan, dan * 8);
            result += String.format("%d x 9 = %d\n", dan, dan * 9);
        } else {
            result = "잘못입력하셨습니다!!";
        }

        System.out.printf(result);


        // Q29 - UpperCase
        // System.in.read() : 키보드로부터 문자 하나를 입력받음
        // 단, 입력받은 문자는 ASCII코드값(10진수)이기 때문에
        // char형으로 변환 필요!
        // A의 ASCII코드값 : 65
        // a의 ASCII코드값 : 97
        // 소문자와 대문자의 차이 : 32

        System.out.print("소문자는? ");
        char lwch = (char)System.in.read();

        if (lwch >= 97 && lwch <= 122) {    // 입력한 문자가 소문자라면
            char upch = (char) (lwch - 32);
            result = String.format(
                    "입력한 %c의 대문자는 %c입니다\n", lwch, upch);
        } else {
            result = "잘못입력하셨습니다\n";
        }

        System.out.println(result);

        // Q33 - CardCheck
        // 임의의 숫자 6자리를 입력하면
        // 신용카드의 종류와 은행정보 출력
        System.out.print("카드번호는? ");
        String num = sc.next();

        String cdno1 = num.charAt(0) + "";
        String cdno2 = cdno1 + num.charAt(1);

        result = "";
        if (cdno1.equals("4")) {
            result += "비자카드/";
            switch (num) {
                case "404825" : result += "비씨카드"; break;
                case "438676" : result += "신한카드"; break;
                case "457973" : result += "국민카드"; break;
            }
        } else if (cdno1.equals("5")) {
            result += "마스터카드/";
            switch (num) {
                case "515594" : result += "신한카드"; break;
                case "524353" : result += "외환카드"; break;
                case "540926" : result += "국민은행"; break;
            }
        } else if (cdno2.equals("35")) {
                result += "JCB카드/";
                switch (num) {
                    case "356317" : result += "농협카드"; break;
                    case "356901" : result += "신한카드"; break;
                    case "356912" : result += "KB국민카드"; break;
             }
        } else {
                result = "잘못된 카드번호 입니다.";
                }
                    System.out.println(result);

        // 34. 거리에 따라 다음 요금이 정해져 있다. 거리를 km로 입력했을 때
        // 배송료를 계산하는 프로그램을 작성하여라. (CalcurateFee)

        // 가. 50km 미만 : 10000원
        // 나. 50 ~ 100km : 18000원
        // 다. 100 ~ 300km : 55000원
        // 라. 300km 이상 : 75000원

        System.out.print("거리는? ");
        int dist = sc.nextInt();

        if (dist >= 300 ) result = "75000원";
        else if (dist >= 100) result = "55000원";
        else if (dist >= 50) result = "18000원";
        else result = "10000원";

        System.out.printf("거리 : %dkm, 금액 : %s", dist, result);
    }
}
