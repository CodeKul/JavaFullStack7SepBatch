package superkeyword;

/**
 * 2. to invoke immediate parent class method
 */
public class Animal {
    void run(){
        System.out.println("Animal is running...");
    }
}
class Cat extends Animal{
    void run(){
        System.out.println("Cat is running");
    }
    void parentRun(){
        super.run();
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.parentRun();
    }
}