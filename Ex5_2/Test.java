package Ex5_2;

public class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(); // Mặc định: radius=1.0, height=1.0
        System.out.println(c1);
        System.out.println("Volume = " + c1.getVolume());

        Cylinder c2 = new Cylinder(2.0, 5.0);
        System.out.println(c2);
        System.out.println("Volume = " + c2.getVolume());

        c2.getBase().setRadius(3.0);
        c2.setHeight(10.0);
        System.out.println("After set radius=3.0, height=10.0 => " + c2);
        System.out.println("Volume = " + c2.getVolume());
    }
}

