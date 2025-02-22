package Ex6_4;

public class Test {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(0, 0, 2, 2);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

        Movable m2 = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
    }
}

