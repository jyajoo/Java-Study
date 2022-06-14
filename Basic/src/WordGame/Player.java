package WordGame;
import java.util.Scanner;

public class Player {

    String name;

    static Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

     String getWordFromUser(String prevWord) {
        String word = scanner.next();
         if (checkSuccess(prevWord, word)) {
             return word;
         } else {
             return "";
         }
    }

    boolean checkSuccess(String prevWord, String word) {
        if (prevWord.charAt(prevWord.length() - 1) == word.charAt(0)) {
            return true;
        } else {
            return false;
        }
    }
}
