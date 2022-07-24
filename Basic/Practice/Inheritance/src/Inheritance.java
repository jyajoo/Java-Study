import java.util.Scanner;

class Q1_TV {
    private int size;

    public Q1_TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class Q1_ColorTV extends Q1_TV{

    private int color;

    public Q1_ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(super.getSize() + "인치 " + this.color + "컬러");
    }

    protected int getColor() {
        return color;
    }
}

class Q2_IPTV extends Q1_ColorTV{

    private String ip;

    public Q2_IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }

    @Override
    public void printProperty() {
        System.out.println("나의 IPTV는 " + this.ip + " 주소의 " + super.getSize() + "인치 " + super.getColor() + "컬러");

    }
}

abstract class Q3_Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요. >> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
        sc.close();
    }
}

class Q3_Won2Dollar extends Q3_Converter{

    public Q3_Won2Dollar(int ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}

class Q4_Km2Mile extends Q3_Converter{

    public Q4_Km2Mile(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "Mile";
    }
}

class Q5_Point {
    private int x, y;

    public Q5_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Q5_ColorPoint extends Q5_Point{

    private String color;

    public Q5_ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public Q5_ColorPoint() {
        super(0, 0);
        this.color = "BLACK";
    }

    public Q5_ColorPoint(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "색의 (" + super.getX() + ", " + super.getY() + ")의 점";
    }
}

class Q7_Point3D extends Q5_Point{

    private int z;

    public Q7_Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")의 점";
    }

    public void moveUp() {
        this.z += 1;
    }

    public void moveDown() {
        this.z -= 1;
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }
}

class Q8_PositivePoint extends Q5_Point{

    public Q8_PositivePoint(int x, int y) {
        super(x, y);
        if (x < 0 || y < 0){
            super.move(0, 0);
        }
    }

    public Q8_PositivePoint() {
        super(0, 0);
    }

    @Override
    protected void move(int x, int y) {
        if (x < 0 || y < 0) {
            return ;
        }
        super.move(x, y);
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ")의 점";
    }
}

interface Q9_Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class Q9_StringStack implements Q9_Stack {
    private int size;
    private int n;
    private String[] stack;

    public Q9_StringStack(int size) {
        this.size = size;
        this.n = 0;
        stack = new String[size];
    }

    @Override
    public int length() {
        return n;
    }

    @Override
    public int capacity() {
        return size;
    }

    @Override
    public String pop() {
        if (n == 0) {
            return null;
        }
        return stack[--n];
    }

    @Override
    public boolean push(String val) {
        if (n == size) {
            return false;
        }
        stack[n++] = val;
        return true;
    }
}

abstract class Q10_PairMap {
    protected String[] keyArray;
    protected String[] valueArray;

    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Q10_Dictionary extends Q10_PairMap {
    private int size;
    private int n;

    public Q10_Dictionary(int size) {
        this.size = size;
        this.n = 0;
        keyArray = new String[size];
        valueArray = new String[size];
    }

    @Override
    String get(String key) {
        for (int i = 0; i < size; i++) {
            if (key == keyArray[i]) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < size; i++) {
            if (key == keyArray[i]) {
                valueArray[i] = value;
                return ;
            }
        }
        keyArray[n] = key;
        valueArray[n++] = value;
    }

    @Override
    String delete(String key) {
        for (int i = 0; i < size; i++) {
            if (key == keyArray[i]) {
                keyArray[i] = null;
                valueArray[i] = null;
            }
        }
        return "해당하는 키는 존재하지 않습니다.";
    }

    @Override
    int length() {
        return n;
    }
}

abstract class Q11_Calc {
    int a;
    int b;

    abstract void setValue(int a, int b);
    abstract int calculate();
}

class Q11_Add extends Q11_Calc{

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a + b;
    }
}

class Q11_Sub extends Q11_Calc{

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a -b;
    }
}

class Q11_Mul extends Q11_Calc{

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a * b;
    }
}

class Q11_Div extends Q11_Calc{

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a / b;
    }
}

abstract class Q12_Shape {
    private Q12_Shape next;
    public Q12_Shape(){
        next = null;
    }

    public void setNext(Q12_Shape obj) {
        next = obj;
    }

    public Q12_Shape getNext() {
        return next;
    }

    public abstract void draw();
}

class Q12_Line extends Q12_Shape {

    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Q12_Rect extends Q12_Shape {

    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Q12_Circle extends Q12_Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Q12_GraphicEditor{
    private Q12_Shape start, end;
    private int size;

    public Q12_GraphicEditor() {
        start = null;
        end = null;
        size = 0;
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        outer:
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int cmd = sc.nextInt();
            Q12_Shape shape = null;
            switch (cmd) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int cmd2 = sc.nextInt();
                    if (cmd2 == 1) {
                        shape = new Q12_Line();
                    } else if (cmd2 == 2) {
                        shape = new Q12_Rect();
                    } else if (cmd2 == 3) {
                        shape = new Q12_Circle();
                    }
                    if (start == null) {
                        start = shape;
                        end = shape;
                    } else {
                        end.setNext(shape);
                        end = shape;
                    }
                    size++;
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >> ");
                    int n = sc.nextInt();
                    if (n > size) {
                        System.out.println("삭제할 수 없습니다.");
                        break;
                    }
                    shape = start;
                    if (shape == null) {
                        System.out.println("삭제할 것이 없습니다.");
                    }
                    Q12_Shape shape2 = start;
                    for (int i = 1; i < n; i++) {
                        if (i == n - 2 && n > 2) {
                            shape2 = shape.getNext();
                        }
                        shape = shape.getNext();
                    }
                    if (shape == start) {
                        if (shape.getNext() != null) {
                            start = shape.getNext();
                        } else {
                            start = null;
                        }
                    } else if (shape == end) {
                        end = shape2;
                        shape2.setNext(null);
                    } else {
                        shape2.setNext(shape.getNext());
                    }
                    size--;
                    break;
                case 3:
                    shape = start;
                    if (shape == null) {
                        System.out.println("삽입된 것이 없습니다.");
                        break;
                    }
                    shape.draw();
                    for (int i = 1; i < size; i++) {
                        shape = shape.getNext();
                        shape.draw();
                    }
                    break;
                case 4:
                    break outer;
            }

        }
    }
}

interface Q13_Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Q13_Circle implements Q13_Shape {

    private int n;

    public Q13_Circle(int n) {
        this.n = n;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + n + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return n * n * PI;
    }
}

class Q14_Oval implements Q13_Shape {

    private int x;
    private int y;

    public Q14_Oval(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return x * y * PI;
    }
}

class Q14_Rect implements Q13_Shape {
    private int x;
    private int y;

    public Q14_Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(x + "x" + y + "크기의 사각형입니다.");
    }

    @Override
    public double getArea() {
        return x * y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        System.out.println("========= Q1 =========");
//        Q1_ColorTV q1_colorTV = new Q1_ColorTV(32, 1024);
//        q1_colorTV.printProperty();

//        System.out.println("========= Q2 =========");
//        Q2_IPTV q2_iptv = new Q2_IPTV("192.1.1.2", 32, 2048);
//        q2_iptv.printProperty();

//        System.out.println("========= Q3 =========");
//        Q3_Won2Dollar q3_won2Dollar = new Q3_Won2Dollar(1200);
//        q3_won2Dollar.run();

//        System.out.println("========= Q4 =========");
//        Q4_Km2Mile q4_km2Mile = new Q4_Km2Mile(1.6);
//        q4_km2Mile.run();

//        System.out.println("========= Q5 =========");
//        Q5_ColorPoint q5_colorPoint = new Q5_ColorPoint(5, 5, "YELLO");
//        q5_colorPoint.setXY(10, 20);
//        q5_colorPoint.setColor("RED");
//        String str = q5_colorPoint.toString();
//        System.out.println(str + "입니다.");

//        System.out.println("========= Q6 =========");
//        Q5_ColorPoint q6_colorPoint = new Q5_ColorPoint();
//        System.out.println(q6_colorPoint.toString() + "입니다.");
//
//        Q5_ColorPoint q6_colorPoint2 = new Q5_ColorPoint(10, 10);
//        q6_colorPoint2.setXY(5, 5);
//        q6_colorPoint2.setColor("RED");
//        System.out.println(q6_colorPoint2.toString() + "입니다.");

//        System.out.println("========= Q7 =========");
//        Q7_Point3D q7_point3D = new Q7_Point3D(1, 2, 3);
//        System.out.println(q7_point3D.toString() + "입니다.");
//
//        q7_point3D.moveUp();
//        System.out.println(q7_point3D.toString() + "입니다.");
//
//        q7_point3D.moveDown();
//        q7_point3D.move(10, 10);
//        System.out.println(q7_point3D.toString() + "입니다.");
//
//        q7_point3D.move(100, 200, 300);
//        System.out.println(q7_point3D.toString() + "입니다.");

//        System.out.println("========= Q8 =========");
//        Q8_PositivePoint q8_positivePoint = new Q8_PositivePoint();
//        q8_positivePoint.move(10, 10);
//        System.out.println(q8_positivePoint.toString() + "입니다.");
//
//        q8_positivePoint.move(-5, 5);
//        System.out.println(q8_positivePoint.toString() + "입니다.");
//
//        Q8_PositivePoint q8_positivePoint2 = new Q8_PositivePoint(-10, -10);
//        System.out.println(q8_positivePoint2.toString() + "입니다.");

//        System.out.println("========= Q9 =========");
//        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Q9_StringStack q9_stringStack = new Q9_StringStack(n);
//
//        while (true) {
//            System.out.print("문자열 입력 >> ");
//            String str = sc.next();
//            if (!q9_stringStack.push(str)) {
//                System.out.println("스택이 꽉 차서 푸시 불가!");
//            }
//            if (str.equals("그만")) {
//                System.out.print("스택에 저장된 모든 문자열 팝 : ");
//                while (true) {
//                    String pop = q9_stringStack.pop();
//                    if (pop == null) {
//                        break;
//                    }
//                    System.out.print(pop + " ");
//                }
//                break;
//            }
//        }

//        System.out.println("========= Q10 =========");
//        Q10_Dictionary q10_dictionary = new Q10_Dictionary(10);
//        q10_dictionary.put("가나다", "자바");
//        q10_dictionary.put("라마바", "파이썬");
//        q10_dictionary.put("라마바", "자바스크립트");
//        System.out.println("라마바의 값은 " + q10_dictionary.get("라마바"));
//        System.out.println("가나다의 값은 " + q10_dictionary.get("가나다"));
//
//        q10_dictionary.delete("가나다");
//        System.out.println("가나다의 값은 " + q10_dictionary.get("가나다"));

//        System.out.println("========= Q11 =========");
//        System.out.print("두 정수와 연산자를 입력하시오 >> ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        String s = sc.next();
//
//        switch (s) {
//            case "+":
//                Q11_Add q11_add = new Q11_Add();
//                q11_add.setValue(x, y);
//                System.out.println(q11_add.calculate());
//                break;
//            case "-":
//                Q11_Sub q11_sub = new Q11_Sub();
//                q11_sub.setValue(x, y);
//                System.out.println(q11_sub.calculate());
//                break;
//            case "*":
//                Q11_Mul q11_mul = new Q11_Mul();
//                q11_mul.setValue(x, y);
//                System.out.println(q11_mul.calculate());
//                break;
//            case "/":
//                Q11_Div q11_div = new Q11_Div();
//                q11_div.setValue(x, y);
//                System.out.println(q11_div.calculate());
//                break;
//        }

//        System.out.println("========= Q12 =========");
//        System.out.println("그래픽 에디어 beauty을 실행합니다.");
//        Q12_GraphicEditor q12_graphicEditor = new Q12_GraphicEditor();
//        q12_graphicEditor.run();
//        System.out.println("beauty를 종료합니다.");

//        System.out.println("========= Q13 =========");
//        Q13_Circle q13_circle = new Q13_Circle(10);
//        q13_circle.redraw();
//        System.out.println("면접은 " + q13_circle.getArea());

        System.out.println("========= Q14 =========");
        Q13_Shape[] q13_shapes = new Q13_Shape[3];
        q13_shapes[0] = new Q13_Circle(10);
        q13_shapes[1] = new Q14_Oval(20, 30);
        q13_shapes[2] = new Q14_Rect(10, 40);

        for (int i = 0; i < q13_shapes.length; i++) {
            q13_shapes[i].redraw();
        }

        for (int i = 0; i < q13_shapes.length; i++) {
            System.out.println("면적은 " + q13_shapes[i].getArea());
        }
    }
}