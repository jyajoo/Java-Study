package Practice;

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
    }
}
