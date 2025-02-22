package Ex3_5;

public class MyMain {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2025, 02, 15);
        System.out.println(d1);
        System.out.println(d1.nextDay());
        System.out.println(d1.nextDay());
        System.out.println(d1.nextMonth());
        System.out.println(d1.nextYear());

        MyDate d2 = new MyDate(2025, 02, 15);
        System.out.println(d2);
        System.out.println(d2.previousDay());
        System.out.println(d2.previousDay());
        System.out.println(d2.previousMonth());
        System.out.println(d2.previousYear());
    }
}
