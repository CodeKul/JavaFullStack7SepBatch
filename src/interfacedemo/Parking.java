package interfacedemo;

//marker interface
public interface Parking {
}
class Car implements Parking {
    void print(){
        System.out.println("in car ");
    }
}
class Bike {
    void print(){
        System.out.println("in bike ");
    }
}
class MarkerImpl{
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        if (car instanceof Parking){
            System.out.println("Allowed");
        }else if (bike instanceof  Parking){
            System.out.println("Not Allowed");
        }
    }
}