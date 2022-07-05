package ex;

public class Calculator {

    public static int run(String s) {
        String[] split = s.split(" \\+ ");
        int no1 = Integer.parseInt(split[0]);
        int no2 = Integer.parseInt(split[1]);

        return no1 + no2;
    }
}
