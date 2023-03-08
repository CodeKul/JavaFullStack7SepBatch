package innerclasses;

public class LocalOuterDemo {
    private String msg="Welcome";
    void show(){
        class LocalInner{
            void showMsg(){
                System.out.println(msg + " To Java World!!!");
            }
        }
        LocalInner inner = new LocalInner();
        inner.showMsg();
    }

    public static void main(String[] args) {
        LocalOuterDemo localOuterDemo = new LocalOuterDemo();

        localOuterDemo.show();
    }
}
