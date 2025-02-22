package Ex6_8;

public class TestRectangle {
    public static void main(String[] args) {
        Movable m = new MovableRectangle(0, 0, 10, 5, 2, 2);
        System.out.println(m);
        m.moveUp();
        System.out.println(m);
        m.moveRight();
        System.out.println(m);
    }
}
