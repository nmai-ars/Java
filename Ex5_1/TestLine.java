package Ex5_1;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Length = " + l1.getLength());
        System.out.println("Gradient (radians) = " + l1.getGradient());
        System.out.println();

        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println("Length = " + l2.getLength());
        System.out.println("Gradient (radians) = " + l2.getGradient());

        l2.setBeginXY(5, 5);
        l2.setEndXY(10, 9);
        System.out.println("After setBeginXY(5,5) and setEndXY(10,9): " + l2);
        System.out.println("Length = " + l2.getLength());
        System.out.println("Gradient (radians) = " + l2.getGradient());
    }
}

