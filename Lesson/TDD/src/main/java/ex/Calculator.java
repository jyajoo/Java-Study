package ex;

public class Calculator {

    public static int calc(String s) {
        boolean isMinus = s.indexOf(" - ") != -1;
        boolean isMulti = s.indexOf(" * ") != -1;
        boolean isDivi = s.indexOf(" / ") != -1;


        if (isMinus) {
            return minus(s);
        } else if (isMulti) {
            return multi(s);
        } else if (isDivi) {
            return divi(s);
        }
        return add(s);

    }


    private static int add(String s) {
        String[] split = s.split(" \\+ ");
        int no1 = Integer.parseInt(split[0]);
        int no2 = Integer.parseInt(split[1]);
        return no1 + no2;
    }

    private static int minus(String s) {
        String[] split = s.split(" \\- ");
        int no1 = Integer.parseInt(split[0]);
        int no2 = Integer.parseInt(split[1]);
        return no1 - no2;
    }

    private static int multi(String s) {
        String[] split = s.split(" \\* ");
        int no1 = Integer.parseInt(split[0]);
        int no2 = Integer.parseInt(split[1]);
        return no1 * no2;
    }

    private static int divi(String s) {
        String[] split = s.split(" \\/ ");
        int no1 = Integer.parseInt(split[0]);
        int no2 = Integer.parseInt(split[1]);
        return no1 / no2;
    }


//            "1 + 1"
//            "1 + 2"
//            "1 - 2"
//            "1 * 2"
//            "4 / 2"
//            "1 + 2 + 3"
//            "1 + 2 * 3"
//            "(1 + 2) * 3"

}
