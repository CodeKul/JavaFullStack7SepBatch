package abstractclass;

public abstract class Vehicle {
    int wheels;
    String brand;
    Vehicle(){}
    public Vehicle(int wheels, String brand) {
        this.wheels = wheels;
        this.brand = brand;
    }

    abstract void run();
    void getColor() {
        System.out.println("in get color method");
    }
   static void display(){
       System.out.println("in display method");

   }
    final void show(){
        System.out.println("in show method");

    }
}

class Bike extends Vehicle{
    @Override
    void run() {
        System.out.println("in bike run method");
    }

    @Override
    void getColor() {
        System.out.println("Color is Black");
    }
}

class Car extends Vehicle{

    @Override
    void run() {
        System.out.println("in car run method");
    }

    @Override
    void getColor() {
        System.out.println("Color is white");
    }
}


class BikeImpl{
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.run();
        vehicle.getColor();
        vehicle.show();
        Vehicle.display();

        Vehicle vehicle1 = new Car();
        vehicle1.run();
        vehicle1.getColor();
        Vehicle.display();
    }
}