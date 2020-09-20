package 第二次作业;

public class Vehicle {
    protected int wheels;
    protected double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle[wheels=" + wheels + ", weight=" + weight + "]";
    }
}

class Car extends Vehicle {
    protected int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car[loader=" + loader + ", wheels=" + wheels + ", weight=" + weight +"]";
    }
}

class Truck extends Car {
    private double payload;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck[" +
                "payload=" + payload +
                ", loader=" + loader +
                ", wheels=" + wheels +
                ", weight=" + weight +
                "]";
    }
}

class Test {
    public static void main(String[] args) {
        Truck truck = new Truck(8,500,4,400);
        System.out.println(truck);
        Car car = new Car(4,200,3);
        System.out.println(car);
        Vehicle vehicle = new Vehicle(2,300);
        System.out.println(vehicle);
    }
}
