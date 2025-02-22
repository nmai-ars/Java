package Ex5_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub ls1 = new LineSub(0, 0, 3, 4);
        System.out.println(ls1);
        System.out.println("Length = " + ls1.getLength());
        System.out.println("Gradient (radians) = " + ls1.getGradient());
        System.out.println();

        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        LineSub ls2 = new LineSub(p1, p2);
        System.out.println(ls2);
        System.out.println("Length = " + ls2.getLength());
        System.out.println("Gradient (radians) = " + ls2.getGradient());

        ls2.setBeginXY(5, 5);
        ls2.setEndXY(10, 9);
        System.out.println("After setBeginXY(5,5) and setEndXY(10,9): " + ls2);
        System.out.println("Length = " + ls2.getLength());
        System.out.println("Gradient (radians) = " + ls2.getGradient());
    }
}

