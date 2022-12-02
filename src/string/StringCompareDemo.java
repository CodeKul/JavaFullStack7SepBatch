package string;

public class StringCompareDemo {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        String s3 = new String("Pune");
        String s4 = "Mumbai";
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
