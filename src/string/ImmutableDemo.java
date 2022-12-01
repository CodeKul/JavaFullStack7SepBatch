package string;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s = "123456";
        System.out.println(s);
        s.concat(",Maharashtra");
        System.out.println(s);
    }
}
