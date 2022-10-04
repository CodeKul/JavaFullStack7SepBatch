package constructor;

public class Car {
    int wheels;
    boolean isSedan;
    String carName;
    Car(){
        System.out.println("in Default constructor");
    }
    public static void main(String[] args) {
        Car c1 = new Car(); // 4 bytes
        Car c2 = new Car(); // 4 bytes
        System.out.println("wheels "+c1.wheels);
        System.out.println("isSedan "+c1.isSedan);
        System.out.println("Car Name "+c1.carName);
    }
}
