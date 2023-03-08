package innerclasses;

public class StaticOuterDemo {
   static int data =10;
    static class StaticInner{
        void show(){
            System.out.println("in show "+data);
        }
    }

    public static void main(String[] args) {
        StaticOuterDemo.StaticInner inner = new StaticOuterDemo.StaticInner();
        inner.show();

    }
}
