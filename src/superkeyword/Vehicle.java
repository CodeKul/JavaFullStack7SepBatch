package superkeyword;

/**
 * 1. to refer immediate parent class instance variable
 */
public class Vehicle {
    String color = "Black";
}

class Car extends Vehicle{
    String color = "White";
    void showColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Car car = new Car();
        car.showColor();
    }
}