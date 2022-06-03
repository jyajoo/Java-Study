import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위바위보 게임 : 가위, 바위, 보 중에서 하나 입력");
        System.out.print("철수 >> ");
        String x = sc.next();
        System.out.print("영희 >>");
        String y = sc.next();

        if (x.equals("가위") && y.equals("바위")) {
            System.out.println("영희가 이겼습니다.");
        } else if (x.equals("가위") && y.equals("보")){
            System.out.println("철수가 이겼습니다.");
        } else if (x.equals("바위") && y.equals("가위")) {
            System.out.println("철수가 이겼습니다.");
        } else if (x.equals("바위") && y.equals("보")) {
            System.out.println("영희가 이겼습니다.");
        } else if (x.equals("보") && y.equals("가위")) {
            System.out.println("영희가 이겼습니다.");
        } else if (x.equals("보") && y.equals("바위")) {
            System.out.println("철수가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
    }
}
