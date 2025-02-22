package Ex6_5;

public class TestRezableCircle {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println(rc);
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());

        rc.resize(50);
        System.out.println(rc);
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());
    }
}

