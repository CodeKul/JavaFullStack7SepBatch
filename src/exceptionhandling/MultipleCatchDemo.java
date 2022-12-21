package exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        String str = "codekul";
        int a[] = new int[5];
        try {
            System.out.println(str.toUpperCase());
            System.out.println("in try block");
            System.out.println(a[4]);
            System.out.println(10/0);
        }catch (NullPointerException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Remaining Code");
    }
}
