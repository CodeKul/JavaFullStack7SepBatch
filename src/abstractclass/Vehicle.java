package abstractclass;

public abstract class Vehicle {
    abstract void run();

    void getColor() {
        System.out.println("in get color methpd");

    }

}

class Bike extends Vehicle{

    @Override
    void run() {

    }
}

class BikeImpl{
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
    }
}