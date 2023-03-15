package java8;

/**
 *  Reference to a constructor
 */
interface Test{
    void display(String msg);
}
public class MRConstructor {
    public MRConstructor(String msg) {
        System.out.println(msg);
    }
}
class MrConstructorImpl{
    public static void main(String[] args) {
        Test test  = MRConstructor::new;
        test.display("HII");
    }
}
