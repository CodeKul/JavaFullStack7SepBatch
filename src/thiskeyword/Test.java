package thiskeyword;

/**
 * 1. to refer current class instance variable
 */
public class Test {
    int n;
    String str;
    Test(int n,String str){
        this.n = n;
        this.str = str;
    }
    void show(){
        System.out.println(n +" "+str);
    }
}
class TestImpl{
    public static void main(String[] args) {
        Test test = new Test(1,"abc");
        test.show();
    }
}