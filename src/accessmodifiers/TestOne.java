package accessmodifiers;

/**
 * accessible within a class only
 * can not access private data members/methods outside the class
 */
public class TestOne {
    private int no;
    private void display(){
        no = 10;
        System.out.println("in display method");
    }
}
class TestOneImpl{
    public static void main(String[] args) {
        TestOne testOne = new TestOne();
       // testOne.no = 10;
       // testOne.display();
    }
}
