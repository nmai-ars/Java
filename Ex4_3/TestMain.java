package Ex4_3;

public class TestMain {
    public static void main(String[] args) {
        Point2D p2d1 = new Point2D();
        System.out.println("p2d1: " + p2d1);
        p2d1.setXY(5.5f, 6.6f);
        System.out.println("p2d1 after setXY: " + p2d1);

        Point2D p2d2 = new Point2D(2.2f, 3.3f);
        System.out.println("p2d2: " + p2d2);

        Point3D p3d1 = new Point3D();
        System.out.println("p3d1: " + p3d1);
        p3d1.setXYZ(1.1f, 2.2f, 3.3f);
        System.out.println("p3d1 after setXYZ: " + p3d1);

        Point3D p3d2 = new Point3D(7.7f, 8.8f, 9.9f);
        System.out.println("p3d2: " + p3d2);
    }
}

