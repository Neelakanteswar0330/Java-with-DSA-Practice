class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    public void ride() {
        System.out.println("Bike is being ridden");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.drive();
        bike.start();
        bike.ride();
    }
}