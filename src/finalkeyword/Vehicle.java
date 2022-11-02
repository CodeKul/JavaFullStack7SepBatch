package finalkeyword;

public class Vehicle {
    final void run(){
        System.out.println("in Bike run method");
    }
}
class Bike   extends Vehicle{
//    @Override
//    void run() {
//        System.out.println("in Bike rum method");
//    }
    //compile time error
}
class VehicleImpl{
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}