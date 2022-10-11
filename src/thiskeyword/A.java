package thiskeyword;

/**
 * 3. to invoke current class method
 */
public class A {
    void m(){
        System.out.println("in m method");
        this.n();
    }
    void n(){
        System.out.println("in n method");
    }
}
class Impl{
    public static void main(String[] args) {
        A a = new A();
        a.m();
    }
}
