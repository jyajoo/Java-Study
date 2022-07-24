/*
추상 클래스 GameObject
 */
public abstract class GameObject {
    protected int distance;     // 이동 거리
    protected int x, y;         // 현재 위치

    // 초기 위치 설정
    public GameObject(int startX, int startY, int distancce) {
        this.x = startX;
        this.y = startY;
        this.distance = distancce;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // 충돌 확인
    public boolean collide(GameObject gameObject) {
        if (this.x == gameObject.getX() && this.y == gameObject.getY())
            return true;
        else
            return false;
    }

    // 이동
    protected abstract void move();
    // 객체의 모양
    protected abstract char getShape();
}
