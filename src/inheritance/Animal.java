package inheritance;

/**
 * Multilevel Inheritance
 */
public class Animal {
    void eat(){
        System.out.println("eating....");
    }
}

class Cat extends Animal{
    void run(){
        System.out.println("running....");
    }
}
class BabyCat extends Cat{
    void sleep(){
        System.out.println("sleeping....");
    }
}

class AnimalImpl{
    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat();
        babyCat.run();
        babyCat.eat();
        babyCat.sleep();
    }
}