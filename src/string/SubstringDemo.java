package string;

public class SubstringDemo {
    public static void main(String[] args) {
        String str = "Codekul";

        System.out.println( str.substring(0,4));//Code
        System.out.println( str.substring(3,6));//eku
        System.out.println(str.substring(2));

       // C o d e k u l
       // 0 1 2 3 4 5 6
        String str1 = "A";
        System.out.println(str1.substring(0));
    }
}
