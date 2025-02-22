package Ex6_6;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat("Meo");
        a1.sound();
        a1.printInfo();

        Animal a2 = new Dog("Cho");
        a2.sound();
        a2.printInfo();

        Animal a3 = new BigDog("CHO");
        a3.sound();
        a3.printInfo();
    }
}
