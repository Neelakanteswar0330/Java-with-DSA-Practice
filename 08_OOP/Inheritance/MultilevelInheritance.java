class LivingThing {
    public void breathe() {
        System.out.println("Living things breathe");
    }
}

class AnimalLevel extends LivingThing {
    public void eat() {
        System.out.println("Animals eat food");
    }
}

class DogLevel extends AnimalLevel {
    public void bark() {
        System.out.println("Dogs bark");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        DogLevel dog = new DogLevel();
        dog.breathe();
        dog.eat();
        dog.bark();
    }
}