package exceptionhandling;
//Null Pointer Ex
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;//"Codekul";
        try {
            System.out.println(str.toUpperCase());
        }
       catch (NullPointerException e){
           System.out.println("Please enter not null string");
           //e.printStackTrace();
        }
        System.out.println("Rest of the code");
    }
}
