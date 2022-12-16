package exceptionhandling;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String s = "1d21";
        try {
            int i = Integer.parseInt(s);

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of code");
    }
}
