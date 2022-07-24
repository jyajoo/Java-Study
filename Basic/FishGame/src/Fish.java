public class Fish extends GameObject{
    public Fish(int startX, int startY, int distancce) {
        super(startX, startY, distancce);
    }

    @Override
    protected void move() {
        int i = (int) (Math.random() * 4);
        switch (i) {
            case 0:
                this.y -= 1;
                break;
            case 1:
                this.x += 1;
                break;
            case 2:
                this.x -= 1;
                break;
            case 3:
                this.y += 1;
                break;
        }
    }

    @Override
    protected char getShape() {
        return '@';
    }
}
