package Ex6_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void printInfo() {
        System.out.println("Cat[name=" + name + "]");
    }
}
