package Ex6_8;

public class TestCircle {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 3, 2, 2, 10);
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
    }
}
