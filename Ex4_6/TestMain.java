package Ex4_6;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Some Animal");
        System.out.println(animal);

        Mamal mammal = new Mamal("Some Mammal");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Max");
        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
    }
}

