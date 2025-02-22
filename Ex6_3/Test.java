package Ex6_3;

public class Test {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(0, 0, 2, 2);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
    }
}

