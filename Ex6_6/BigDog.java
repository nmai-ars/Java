package Ex6_6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woow");
    }

    @Override
    public void printInfo() {
        System.out.println("BigDog[name=" + name + "]");
    }
}
