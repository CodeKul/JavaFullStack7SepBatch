package polymorphism;

public class Bike {
    void run(){
        System.out.println("Bike run method");
    }
}
class Pulsur extends Bike{
    @Override
    void run(){
        System.out.println("Pulsur run method");
    }
}
class BikeImpl{
    public static void main(String[] args) {
        Bike bike = new Pulsur(); //Upcasting
        bike.run();
    }
}