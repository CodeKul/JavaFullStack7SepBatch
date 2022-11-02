package finalkeyword;

/**
 * final variable
 */
public class Car  {
    final int speedLimit = 90;
    final String chassisNo; // blank final variable
    static final String data; //static blank final variable
    Car(){
        chassisNo = "AP856434566";
    }
    static {
        data = "msg";
    }
    void run(){
        //speedLimit = 110;
        //compile time error

    }
}
class CarImpl{
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
    }
}