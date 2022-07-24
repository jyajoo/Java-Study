package Practice;

import java.util.Dictionary;
import java.util.Scanner;

class Ex01 {
    String manufacturer;
    int year;
    int size;

    public Ex01(String manufacturer, int year, int size) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
    }

    void show() {
        System.out.println(manufacturer + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}

class Ex02 {
    int math;
    int science;
    int english;

    public Ex02(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    int average() {
        return (math + science + english) / 3;
    }
}

class Ex03 {
    String title;
    String artist;
    int year;
    String country;

    public Ex03() {
    }

    public Ex03(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    void show() {
        System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
}

class Ex04 {
    int x, y, width, height;

    public Ex04(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + "X" + height + "인 사각형");
    }

    public int squre() {
        return width * height;
    }

    public boolean contains(Ex04 ex04) {
        if (x < ex04.x && y < ex04.y &&
                (width + x) > (ex04.width + ex04.x) && (height + y) > (ex04.height + ex04.y)) {
            return true;
        } else {
            return false;
        }
    }
}

class Ex05 {
    private double x, y;
    private int radius;

    public Ex05(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }

    public double getRadius() {
        return radius;
    }
}

class Ex07_1 {
    private String work;

    public void set(String work) {
        this.work = work;
    }

    public String get() {
        return work;
    }

    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

class Ex07_2 {
    Scanner scanner = new Scanner(System.in);
    Ex07_1[] ex07_1s;

    public Ex07_2(int num) {
        ex07_1s = new Ex07_1[num];
        for (int i = 0; i < num; i++) {
            ex07_1s[i] = new Ex07_1();
        }
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램");
        while (true) {
            System.out.print("할일( 입력 : 1, 보기 : 2, 끝내기 3 ) >> ");
            int cmd = scanner.nextInt();
            if (cmd == 1) {
                System.out.print("날짜(1~30)? ");
                int day = scanner.nextInt();
                System.out.print("할일(빈칸없이입력)? ");
                String work = scanner.next();
                ex07_1s[day - 1].set(work);
            } else if (cmd == 2) {
                System.out.print("날짜(1~30)? ");
                int day = scanner.nextInt();
                System.out.print(day + "일의 할 일은 ");
                ex07_1s[day - 1].show();
            } else if (cmd == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}

class Ex08 {
    String name;
    String tel;

    public Ex08(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

class Ex09 {
    public static int[] concat(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }

        for (int i = a.length; i < (a.length + b.length); i++) {
            array[i] = b[i - a.length];
        }
        return array;
    }

    public static void print(int[] a) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
}

class Ex10 {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];
            }
        }
        return "";
    }
}

class Ex11_1 {
    private int a;
    private int b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}

class Ex11_2 {
    private int a;
    private int b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a - b;
    }
}

class Ex11_3 {
    private int a;
    private int b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a * b;
    }
}

class Ex11_4 {
    private int a;
    private int b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a / b;
    }
}

class Ex12 {
    private String[][] seats;

    Ex12() {
        seats = new String[3][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                seats[i][j] = "---";
            }
        }
    }

    public void booking(int n) {
        Scanner scanner = new Scanner(System.in);
        print_seat(n);
        System.out.print("이름 >> ");
        String name = scanner.next();
        System.out.print("번호 >> ");
        int num = scanner.nextInt();

        if (n > 0 && n < 4) {
            seats[n - 1][num - 1] = name;
        }else {
            System.out.print("1부터 3까지 입력해야 합니다.");
        }
    }

    private void print_seat(int n) {


        if (n == 1) {
            System.out.print("S>> ");
        } else if (n == 2) {
            System.out.print("A>> ");
        } else if (n == 3) {
            System.out.print("b>> ");
        } else {
            System.out.println("1부터 3까지 입력해야 합니다.");
            return;
        }

        for (int j = 0; j < 10; j++) {
            System.out.print(seats[n - 1][j] + " ");
        }
        System.out.println();
    }

    public void inquiry() {

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print("S>> ");
            } else if (i == 1) {
                System.out.print("A>> ");
            } else if (i == 2) {
                System.out.print("b>> ");
            } else {
                System.out.println("1부터 3까지 입력해야 합니다.");
            }

            for (int j = 0; j < 10; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("<<<조회를 완료하였습니다>>>");
    }

    public void cancel(int n) {
        Scanner scanner = new Scanner(System.in);
        print_seat(n);
        System.out.print("이름 >> ");
        String name = scanner.next();

        for (int i = 0; i < 10; i++) {
            if (seats[n-1][i].equals(name)) {
                seats[n-1][i] = "---";
                break;
            }
        }
    }
}


public class Class_Object_Examples {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------[Ex01]---------");
        Ex01 ex01 = new Ex01("LG", 2017, 32);
        ex01.show();

        System.out.println("---------[Ex02]---------");
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
        Ex02 ex02 = new Ex02(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("평균은 " + ex02.average());

        System.out.println("---------[Ex03]---------");
        Ex03 ex03 = new Ex03("Dancing Queen", "ABBA", 1978, "스웨덴");
        ex03.show();

        System.out.println("---------[Ex04]---------");
        Ex04 ex04_1 = new Ex04(2, 2, 8, 7);
        Ex04 ex04_2 = new Ex04(5, 5, 6, 6);
        Ex04 ex04_3 = new Ex04(1, 1, 10, 10);

        ex04_1.show();
        System.out.println("s의 면적은 " + ex04_2.squre());
        if (ex04_3.contains(ex04_1)) System.out.println("ex04_3은 ex04_1을 포함합니다");
        if (ex04_3.contains(ex04_2)) System.out.println("ex04_3은 ex04_2을 포함합니다");

        System.out.println("---------[Ex05]---------");
        Ex05[] ex05s = new Ex05[3];
        for (int i = 0; i < ex05s.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            ex05s[i] = new Ex05(x, y, radius);
        }
        for (int i = 0; i < ex05s.length; i++) {
            ex05s[i].show();
        }

        System.out.println("---------[Ex06]---------");
        double max = 0;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (ex05s[i].getRadius() > max) {
                max = ex05s[i].getRadius();
                index = i;
            }
        }
        System.out.print("가장 면적이 큰 원은 ");
        ex05s[index].show();

        System.out.println("---------[Ex07]---------");
        Ex07_2 ex07_2 = new Ex07_2(30);
        ex07_2.run();

        System.out.println("---------[Ex08]---------");
        System.out.print("인원수>> ");
        int num = scanner.nextInt();
        Ex08[] ex08s = new Ex08[num];
        for (int i = 0; i < num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
            String name = scanner.next();
            String tel = scanner.next();
            ex08s[i] = new Ex08(name, tel);
        }

        System.out.println("저장되었습니다...");
        while(true){
            System.out.print("검색할 이름 >> ");
            String name = scanner.next();
            int check = 0;
            if (name.equals("그만")) {
                break;
            }

            for(Ex08 ex08 : ex08s){
                if (ex08.name.equals(name)) {
                    System.out.println(name + "의 번호는 " + ex08.tel + "입니다.");
                    check += 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println(name + "이/가 없습니다.");
            }
        }

        System.out.println("---------[Ex09]---------");
        int array1[] = {1, 5, 7, 9};
        int array2[] = {3, 6, -1, 100, 77};
        int array3[] = Ex09.concat(array1, array2);
        Ex09.print(array3);

        System.out.println("---------[Ex10]---------");
        System.out.println("한영 단어 검색 프로그램입니다.");
        while (true) {
            System.out.print("한글 단어? ");
            String kor = scanner.next();
            if (kor.equals("그만")) {
                break;
            }
            String s = Ex10.kor2Eng(kor);
            if (s.equals("")) {
                System.out.println(kor + "은/는 저의 사전에 없습니다.");
            } else {
                System.out.println(kor + "은/는 " + s);
            }
        }

        System.out.println("---------[Ex11]---------");
        System.out.print("두 정수와 연사자를 입력하시오 >> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String p = scanner.next();

        switch (p) {
            case "+":
                Ex11_1 ex11_1 = new Ex11_1();
                ex11_1.setValue(x, y);
                System.out.println(ex11_1.calculate());
                break;
            case "-":
                Ex11_2 ex11_2 = new Ex11_2();
                ex11_2.setValue(x, y);
                System.out.println(ex11_2.calculate());
                break;
            case "*":
                Ex11_3 ex11_3 = new Ex11_3();
                ex11_3.setValue(x, y);
                System.out.println(ex11_3.calculate());
                break;
            case "/":
                Ex11_4 ex11_4 = new Ex11_4();
                ex11_4.setValue(x, y);
                System.out.println(ex11_4.calculate());
                break;
        }

        System.out.println("---------[Ex12]---------");
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Ex12 ex12 = new Ex12();

        while (true) {
            System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >> ");
            int cmd = scanner.nextInt();
            if (cmd == 1) {
                System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
                ex12.booking(scanner.nextInt());
            } else if (cmd == 2) {
                ex12.inquiry();
            } else if (cmd == 3) {
                System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
                ex12.cancel(scanner.nextInt());
            } else if (cmd == 4) {
                break;
            }
        }
    }
}
