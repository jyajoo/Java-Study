import java.util.Scanner;

public class Bear extends GameObject{
    public Bear(int startX, int startY, int distancce) {
        super(startX, startY, distancce);
    }

    @Override
    protected void move() {
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();

        switch (cmd) {
            case "a":
                this.y -= 1;
                break;
            case "s":
                this.x += 1;
                break;
            case "w":
                this.x -= 1;
                break;
            case "d":
                this.y += 1;
                break;
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}
