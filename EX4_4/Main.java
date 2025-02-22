package EX4_4;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("p1: " + p1);

        Point p2 = new Point(2.5f, 3.5f);
        System.out.println("p2: " + p2);

        MovablePoint mp1 = new MovablePoint();
        System.out.println("mp1: " + mp1);
        mp1.setXY(1.0f, 1.0f);
        mp1.setSpeed(2.0f, 2.0f);
        System.out.println("mp1 after set: " + mp1);
        mp1.move();
        System.out.println("mp1 after move: " + mp1);

        MovablePoint mp2 = new MovablePoint(3.0f, 4.0f, 0.5f, 0.5f);
        System.out.println("mp2: " + mp2);
        mp2.move();
        System.out.println("mp2 after move: " + mp2);
    }
}

