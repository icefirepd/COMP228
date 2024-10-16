package AnimalHierarchy;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public @Override void makeSound() {
        System.out.println("Meow");
    }
}
