package Ex2_9;

public class Test {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 3);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        System.out.println(t1);

        MyTriangle t2 = new MyTriangle(1, 1, 4, 5, 7, 1);
        System.out.println(t2);

        System.out.println("Perimeter of t1: " + t1.getPerimeter());
        System.out.println("Perimeter of t2: " + t2.getPerimeter());

        System.out.print("Type of t1: ");
        t1.printType();

        System.out.print("Type of t2: ");
        t2.printType();
    }
}
