// Interface defining the contract
interface Animal {
    // Abstract method (implicitly public abstract)
    void makeSound();

    // Default method (Java 8+)
    default void sleep() {
        System.out.println("Zzz...");
    }
}

// Concrete class implementing the interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Main class
public class AbstractionUsingInterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Woof
        dog.sleep();     // Output: Zzz...

        cat.makeSound(); // Output: Meow
        cat.sleep();     // Output: Zzz...
    }
}   