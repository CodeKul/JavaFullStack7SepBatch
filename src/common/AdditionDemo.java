package common;

public class AdditionDemo {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int c = a+b;
        String msg = args[2];
        System.out.println(c);
        System.out.println(msg);
    }
}
