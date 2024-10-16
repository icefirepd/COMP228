package AnimalHierarchy;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public @Override void makeSound() {
        System.out.println("Bark");
    }
}