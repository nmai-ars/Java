package Ex4_5;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("circle1 area = " + circle1.getArea());
        System.out.println("circle1 perimeter = " + circle1.getPerimeter());

        Circle circle2 = new Circle(2.5, "yellow", true);
        System.out.println(circle2);
        System.out.println("circle2 area = " + circle2.getArea());
        System.out.println("circle2 perimeter = " + circle2.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println("rectangle1 area = " + rectangle1.getArea());
        System.out.println("rectangle1 perimeter = " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(2.0, 4.0, "red", false);
        System.out.println(rectangle2);
        System.out.println("rectangle2 area = " + rectangle2.getArea());
        System.out.println("rectangle2 perimeter = " + rectangle2.getPerimeter());

        Square square1 = new Square();
        System.out.println(square1);
        System.out.println("square1 area = " + square1.getArea());
        System.out.println("square1 perimeter = " + square1.getPerimeter());

        Square square2 = new Square(5.0, "purple", true);
        System.out.println(square2);
        System.out.println("square2 area = " + square2.getArea());
        System.out.println("square2 perimeter = " + square2.getPerimeter());

        square2.setSide(10.0);
        System.out.println("square2 after setSide(10.0) => " + square2);
        System.out.println("square2 area = " + square2.getArea());
        System.out.println("square2 perimeter = " + square2.getPerimeter());
    }
}

