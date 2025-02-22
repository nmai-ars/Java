package Ex6_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void printInfo() {
        System.out.println("Dog[name=" + name + "]");
    }
}