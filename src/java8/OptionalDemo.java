package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] fruits = new String[5];
        Optional<String> stringOptional =  Optional.ofNullable(fruits[3]);
        if (stringOptional.isPresent())
            System.out.println(fruits[3].toUpperCase());
        else
            System.out.println("Given string is null");

        //if present
        String name = "Codekul";
        Optional<String> nameOptional =  Optional.of(name);
        nameOptional.ifPresent( str -> System.out.println(str.length()));

        // orElse
        String city = null;

        city = Optional.ofNullable(city).orElse("Pune");
        System.out.println(city);

        //orElseGet
       city =  Optional.ofNullable(city).orElseGet(()->"Mumbai");
        System.out.println(city);

        //orElseThrow

        city = Optional.ofNullable(city).orElseThrow(ArithmeticException::new);
        System.out.println(city);
    }
}
