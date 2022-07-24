package Practice;

import java.util.Scanner;

public class BasicExample {
    Scanner sc = new Scanner(System.in);

    void Ex01(){
        System.out.println("---------[Ex01]---------");
        System.out.print("원화를 입력하세요(단위 원)>>");
        int won = sc.nextInt();
        System.out.println(won + "원은 $" + won/1100.0 + "입니다.");
    }

    void Ex02(){
        System.out.println("---------[Ex02]---------");
        System.out.print("2자리수 정수 입력(10~99)>>");
        int num = sc.nextInt();
        int x = num % 10, y = num / 10;
        if (x == y) {
            System.out.println("10의 자리와 1의 자리가 같다.");
        } else {
            System.out.println("10의 자리와 1의 자리가 다르다.");
        }
    }

    void Ex03() {
        System.out.println("---------[Ex03]---------");
        System.out.print("금액을 입력하시오>>");
        int money = sc.nextInt();
        System.out.println("오만원권 " + money / 50000 + "매");
        money %= 50000;
        System.out.println("만원권 " + money / 10000 + "매");
        money %= 10000;
        System.out.println("천원권 " + money / 1000 + "매");
        money %= 1000;
        System.out.println("백원 " + money / 100 + "개");
        money %= 100;
        System.out.println("오십원 " + money / 50 + "개");
        money %= 50;
        System.out.println("십원 " + money / 10 + "개");
        money %= 10;
        System.out.println("일원 " + money / 1 + "개");
    }

    void Ex04() {
        System.out.println("---------[Ex04]---------");
        System.out.print("정수 3개 입력>>");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if (x > y && x < z) {
            System.out.println("중간 값은 " + x);
        } else if (y > x && y < z) {
            System.out.println("중간 값은 " + y);
        } else {
            System.out.println("중간 값은 " + z);
        }
    }

    void Ex05() {
        System.out.println("---------[Ex05]---------");
        System.out.print("정수 3개 입력>>");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if ((x + y > z) && (x + z > y) && (y + z > x)) {
            System.out.println("삼각형이 가능하다.");
        } else {
            System.out.println("삼각형이 되지 않는다.");
        }
    }

    void Ex06() {
        System.out.println("---------[Ex06]---------");
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int x = sc.nextInt();
        int a = x / 10;
        int b = x % 10;
        if (a == 3 || a == 6 || a == 9) {
            if (b == 3 || b == 6 || b == 9) {
                System.out.println("박수짝짝");
            } else {
                System.out.println("박수짝");
            }
        }else if (b == 3 || b == 6 || b == 9) {
            System.out.println("박수짝");
        } else {
            System.out.println("박수를 치지 않는다.");
        }
    }

    void Ex07() {
        System.out.println("---------[Ex07]---------");
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int x = sc.nextInt(), y = sc.nextInt();
        if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
            System.out.println("(" + x + "," + y + ")는 사각형 안에 있다.");
        } else {
            System.out.println("(" + x + "," + y + ")는 사각형 안에 없다.");
        }
    }

    public static boolean inRect(int x, int y) {
        if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
            return true;
        }
        return false;
    }

    void Ex08() {
        System.out.println("---------[Ex08]---------");
        System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        if (inRect(x1, y1) || inRect(x2, y2)) {
            System.out.println("두 직사각형은 충돌한다.");
        } else {
            System.out.println("두 직사각형은 충동하지 않는다.");
        }
    }

    void Ex09() {
        System.out.println("---------[Ex09]---------");
        System.out.print("원의 중심과 반지름 입력>>");
        double x = sc.nextDouble(), y = sc.nextDouble(), r = sc.nextDouble();
        System.out.print("점 입력>>");
        double a = sc.nextDouble(), b = sc.nextDouble();
        // 원 중심과 입력된 점의 거리
        double distance = Math.sqrt((x - a)*(x - a) + (y - b) * (y - b));
        if (distance > r) {
            System.out.println("(" + a + "," + b + ")는 원 안에 없다.");
        } else {
            System.out.println("(" + a + "," + b + ")는 원 안에 있다.");
        }
    }

    void Ex10() {
        System.out.println("---------[Ex10]---------");
        System.out.print("첫번째 원의 중심과 반지름 입력 >>");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), r1 = sc.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력 >>");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble(), r2 = sc.nextDouble();

        double distance = Math.sqrt((x1 - x2) *(x1 - x2) + (y1 - y2) * (y1 - y2));
        if (distance > (r1 + r2)) {
            System.out.println("두 원은 겹치지 않는다.");
        } else {
            System.out.println("두 원은 서로 겹친다.");
        }
    }

    void Ex11_1() {
        System.out.println("---------[Ex11_1]---------");
        System.out.print("달을 입력(1~12)>>");
        int x = sc.nextInt();
        if (x >= 3 && x <= 5) {
            System.out.println("봄");
        } else if (x >= 6 && x <= 8) {
            System.out.println("여름");
        } else if (x >= 9 && x <= 11) {
            System.out.println("가을");
        } else if (x == 12 || x == 1) {
            System.out.println("겨울");
        } else {
            System.out.println("잘못입력");
        }
    }

    void Ex11_2() {
        System.out.println("---------[Ex11_2]---------");
        System.out.print("달을 입력(1~12)>>");
        int x = sc.nextInt();
        switch (x) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못입력");
        }
    }

    void Ex12_1() {
        System.out.println("---------[Ex12_1]---------");
        System.out.print("연산>>");
        double a = sc.nextDouble();
        String x = sc.next();
        double b = sc.nextDouble();

        if (x.equals("+")) {
            System.out.println(a + x + b + "의 계산 결과는 " + (a+b));
        } else if (x.equals("-")) {
            System.out.println(a + x + b + "의 계산 결과는 " + (a-b));
        } else if (x.equals("*")) {
            System.out.println(a + x + b + "의 계산 결과는 " + (a*b));
        } else if (x.equals("/")) {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없다.");
            } else {
                System.out.println(a + x + b + "의 계산 결과는 " + (a/b));
            }
        }
    }

    void Ex12_2() {
        System.out.println("---------[Ex12_2]---------");
        System.out.print("연산>>");
        double a = sc.nextDouble();
        String x = sc.next();
        double b = sc.nextDouble();

        switch (x) {
            case "+":
                System.out.println(a + x + b + "의 계산 결과는 " + (a+b));
                break;
            case "-":
                System.out.println(a + x + b + "의 계산 결과는 " + (a-b));
                break;
            case "*":
                System.out.println(a + x + b + "의 계산 결과는 " + (a*b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없다.");
                } else {
                    System.out.println(a + x + b + "의 계산 결과는 " + (a/b));
                }
                break;
        }
    }

    public static void main(String[] args) {
        BasicExample ex = new BasicExample();
        ex.Ex01();
        ex.Ex02();
        ex.Ex03();
        ex.Ex04();
        ex.Ex05();
        ex.Ex06();
        ex.Ex07();
        ex.Ex08();
        ex.Ex09();
        ex.Ex10();
        ex.Ex11_1();
        ex.Ex11_2();
        ex.Ex12_1();
        ex.Ex12_2();
    }
}
