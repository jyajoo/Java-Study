package WordGame;
import java.util.Scanner;

public class WordGameApp {

    static Scanner scanner = new Scanner(System.in);

    public WordGameApp() {
    }

    static void run(int num) {

        Player [] players = new Player[num];
        for (int i = 0; i < num; i++) {
            System.out.print("참가자의 별명을 입력하세요 >> ");
            String name = scanner.next();
            players[i] = new Player(name);
        }

        System.out.println("시작하는 단어는 \"지우개\"입니다.");

        String prevWord = "지우개";

        while (true) {
            for (Player p : players) {
                System.out.print(p.name + ">> ");
                String word = p.getWordFromUser(prevWord);
                if (word == "") {
                    System.out.println(p.name + "이/가 졌습니다.");
                    break;
                } else {
                    prevWord = word;                }
            }
        }
    }

    public static void main(String[] args) {
        /*
        단순히, 끝 문자와 첫 문자가 동일한지만 비교함.
         */

        System.out.println("끝말잇기 게임 시작...");
        System.out.print("게임에 참가하는 인원은 몇 명인가요? ");

        int num = scanner.nextInt();
        run(num);
    }
}
