package java8;

/**
 * Reference to an object
 */

interface VehicleService{
    void showVehicleDetails();
}

public class MethodReferenceDemo1 {
    void display(){
        System.out.println("Ex on Method Reference to an instance method of an object");
    }

    public static void main(String[] args) {
        MethodReferenceDemo1 demo1 = new MethodReferenceDemo1();
        VehicleService vehicleService= demo1::display;
        vehicleService.showVehicleDetails();
    }
}
