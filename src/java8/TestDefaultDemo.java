package java8;
@FunctionalInterface
interface TestDefault{
    void calculate();
    default void show(){
        System.out.println("in show method");
    }
    static void start(){
        System.out.println("in start method");
    }
}
public class TestDefaultDemo {
    public static void main(String[] args) {
        TestDefault testDefault = () -> {
            System.out.println(10+20);
        };
        testDefault.calculate();
        testDefault.show();

    }
}
