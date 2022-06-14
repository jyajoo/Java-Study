package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_Repeat_Exception_Examples {
    /*
    배열, 반복문, 예외 처리 연습
     */

    Scanner sc = new Scanner(System.in);

    void Ex01_3() {
        System.out.println("---------[Ex01_3]---------");
        int sum = 0;
        for (int i = 0; i < 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    void Ex01_4() {
        System.out.println("---------[Ex01_4]---------");
        int sum = 0, i = 0;
        do {
            sum += i;
            i += 2;
        } while (i < 100);
        System.out.println(sum);
    }

    void Ex02() {
        System.out.println("---------[Ex02]---------");
        int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }

    void Ex03() {
        System.out.println("---------[Ex03]---------");
        System.out.print("정수를 입력하시오>>");
        int cnt = sc.nextInt();
        for (int i = cnt; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void Ex04() {
        System.out.println("---------[Ex04]---------");
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        /*
        scanner를 통해 입력받는 것은 String 타입이다.
        charAt() : 문자열 중 하나를 골라 char 타입으로 변환. (인덱스로 0을 넣어주어, 첫 글자 선택)
         */
        char alpha = sc.next().charAt(0);

        for (int i = 0; i <= alpha - 'a'; i++) {
            for (char j = 'a'; j <= alpha - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void Ex05() {
        System.out.println("---------[Ex05]---------");
        System.out.print("양의 정수 10개를 입력하시오>>");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("3의 배수는 ");
        for (int i : arr) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    void Ex06() {
        System.out.println("---------[Ex06]---------");
        System.out.print("금액을 입력하시오>>");
        int money = sc.nextInt();

        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        for (int i : unit) {
            if (money / i != 0) {
                System.out.println(i + "원 짜리 : " + money / i + "개");
                money %= i;
            }
        }
    }

    void Ex07() {
        System.out.println("---------[Ex07]---------");
        int sum = 0;

        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 10 + 1);   // 1부터 10까지의 범위의 정수 랜덤 생성
            System.out.print(x + " ");
            sum += x;
        }
        System.out.println();
        System.out.print("평균은 " + (double) sum / 10);
    }

    void Ex08() {
        System.out.println("---------[Ex08]---------");
        System.out.print("정수 몇개?");
        int x = sc.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            int value = (int) (Math.random() * 100 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == value) {
                    i--;
                    break;
                }
            }
            arr[i] = value;
        }

        for (int i = 0; i < x; i++) {
            if (i != 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }

    void Ex09() {
        System.out.println("---------[Ex09]---------");
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void Ex10() {
        System.out.println("---------[Ex10]---------");
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        for (int i = 0; i < 6; i++) {
            int x = (int) (Math.random() * 4);
            int y = (int) (Math.random() * 4);
            if (arr[x][y] != 0) {
                arr[x][y] = 0;
            } else {
                i--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void Ex13() {
        System.out.println("---------[Ex13]---------");
        for (int i = 0; i < 38; i++) {
            int x = i / 10;
            int y = i % 10;
            if (x == 3 || x == 6 || x == 9) {
                if (y == 3 || y == 6 || y == 9) {
                    System.out.println(i + "박수 짝짝");
                } else {
                    System.out.println(i + "박수 짝");
                }
            }
        }
    }

    void Ex14() {
        System.out.println("---------[Ex14]---------");
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};

        while (true) {
            System.out.print("과목 이름>>");
            String command = sc.next();
            if (command.equals("그만")) {
                break;
            }
            int cnt = 0;
            for (int i = 0; i < course.length; i++) {
                if (command.equals(course[i])) {
                    System.out.println(command + "의 점수는 " + score[i]);
                    cnt += 1;
                    break;
                }
            }
            if (cnt == 0) {
                System.out.println("없는 과목입니다.");
            }
        }
    }

    void Ex15() {
        System.out.println("---------[Ex15]---------");
        while(true) {
            System.out.print("곱하고자 하는 두 수 입력>>");
            try {
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.print(n + "X" + m +"="+ n*m);
                break;
            }catch(InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                sc.nextLine();
                continue;
            }
        }
    }

    void Ex16() {
        System.out.println("---------[Ex16]---------");
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        String str[] = {"가위", "바위", "보"};
        while (true) {
            System.out.print("가위 바위 보!>>");
            String command = sc.next();
            if (command.equals("그만")) {
                break;
            }
            int computer = (int) (Math.random() * 3);
            System.out.print("사용자 = " + command + ", 컴퓨터 = " + str[computer] + ", ");

            if (computer == 0) {
                if (command.equals("가위")) {
                    System.out.println("비겼습니다.");
                } else if (command.equals("바위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else if (command.equals("보")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else {
                    System.out.println("옳은 명령어를 입력해주세요.");
                }
            } else if (computer == 1) {
                if (command.equals("가위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if (command.equals("바위")) {
                    System.out.println("비겼습니다.");
                } else if (command.equals("보")) {
                    System.out.println("사용자가 이겼습니다.");
                } else {
                    System.out.println("옳은 명령어를 입력해주세요.");
                }
            } else {
                if (command.equals("가위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else if (command.equals("바위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if (command.equals("보")) {
                    System.out.println("비겼습니다.");
                } else {
                    System.out.println("옳은 명령어를 입력해주세요.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Array_Repeat_Exception_Examples n = new Array_Repeat_Exception_Examples();
        n.Ex16();
    }
}
