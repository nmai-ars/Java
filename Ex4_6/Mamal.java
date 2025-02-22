package Ex4_6;

public class Mamal extends Animal {
    public Mamal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

