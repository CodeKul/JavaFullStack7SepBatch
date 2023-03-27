package java8;

import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        String msg = "Welcome";
        System.out.println(msg);
        String base64String = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("Base 64 String: "+base64String);

        byte[] bytes = Base64.getDecoder().decode(base64String);
        String decoded = new String(bytes);
        System.out.println("Decoded string: "+decoded);
    }
}
