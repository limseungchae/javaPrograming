package examples;

public class EX02 {
    public static void main(String[] args) {

                // 3
                int colorPen = 5 * 12;
                int studentCount = 27;
                int divColorPen = colorPen/studentCount;
                System.out.printf("학생당 나눠가지는 색연필 수 : %d\n",divColorPen);

                int remaincolorPen = colorPen % studentCount;
                System.out.printf("똑같이 나눠가지고 남은 볼펜수 : %d\n",remaincolorPen);

                // 4
                int age = 8;
                double height =120;
                boolean parent = true;
                boolean hearchDease = false;
                boolean isPossible;

                if((age >= 6) && (height >= 120) && (hearchDease == false)){
                    isPossible = true;
                } else if( (age < 6) && (height >= 120) && (parent == true) && (hearchDease == false)) {
                    isPossible = true;
                } else {
                    isPossible = false;
                }

                String result = isPossible == true ? "탑승 가능합니다." : "탑승 불가능합니다.";
                System.out.printf("%s\n",result);

                // 6
                int price = 187000;
                int oman = price/50000;
                int ilman = price%50000/10000;
                int ochun = price%50000%10000/5000;
                int ilchun = price%50000%10000%5000/1000;

                System.out.printf("5만원권 : %d\n",oman);
                System.out.printf("1만원권 : %d\n",ilman);
                System.out.printf("5천원권 : %d\n",ochun);
                System.out.printf("1천원권 : %d\n",ilchun);

            }
        }

