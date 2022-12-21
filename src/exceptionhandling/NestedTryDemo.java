package exceptionhandling;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10/0);
                System.out.println("Inner Try Statement");

            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            String str = null;
            System.out.println(str.toUpperCase());
            System.out.println("Outer Try Statement");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }
}
