package Ex2_7;

public class test {
	public static void main(String[] args) {

        MyLine line1 = new MyLine(1, 1, 4, 5);

        MyPoint p1 = new MyPoint(2, 3);
        MyPoint p2 = new MyPoint(6, 7);
        MyLine line2 = new MyLine(p1, p2);

        System.out.println(line1);
        System.out.println(line2);

        System.out.println("Begin X of line1: " + line1.getBeginX());
        System.out.println("End Y of line2: " + line2.getEndY());

        line1.setBeginXY(0, 0);
        System.out.println("After changing begin of line1: " + line1);

        System.out.println("Length of line1: " + line1.getLength());

        System.out.println("Gradient of line1: " + line1.getGradient());
    }
}
