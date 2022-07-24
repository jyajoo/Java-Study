import java.io.*;

public class Game {
    public static void main(String[] args) throws IOException {
        Bear bear = new Bear(0, 0, 1);
        Fish fish = new Fish(5, 5, 1);

        System.out.println("** Bear의 fish 먹기 게임을 시작합니다. **");

        int cnt = 0;

        while(true){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 20; j++) {
                     if (bear.getX() == i && bear.getY() == j) {
                        System.out.print(bear.getShape());
                        continue;
                    }else if (fish.getX() == i && fish.getY() == j) {
                        System.out.print(fish.getShape());
                        continue;
                    }
                    System.out.print("-");
                }
                System.out.println();
            }

            if (bear.collide(fish)) {
                System.out.println("Bear Wins!!!");
                break;
            }

            System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
            bear.move();

            if (cnt == 5) {
                cnt = 0;
            }
            if ((int) Math.random() * 2 == 0 && cnt < 2) {
                fish.move();
                cnt++;
            } else {
                cnt++;
            }
        }
    }
}
