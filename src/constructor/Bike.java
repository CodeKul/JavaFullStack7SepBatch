package constructor;

public class Bike {
    String bikeName;
    String variant;
    int no;
    Bike(){

    }
    Bike(String name,String var,int n){
        bikeName = name;
        variant = var;
        no = n;
    }
    Bike(String name,String var){
        bikeName = name;
        variant = var;
    }
    void display(){
        System.out.println("Bike No:"+no);
        System.out.println("Bike Name:"+bikeName);
        System.out.println("Bike variant:"+variant);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Bike b1 = new Bike("Pulsar","Petrol",1);
        b1.display();
        Bike b2 = new Bike("Activa","Electric",2);
        b2.display();
        Bike b3 = new Bike("Scooty-Pep","Petrol");
        b3.display();
        System.out.println(new Bike());  // constructor returns current class instance
    }
}
