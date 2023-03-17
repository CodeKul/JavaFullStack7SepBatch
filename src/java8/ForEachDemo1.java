package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachDemo1 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Pune","Mumbai","Goa","Delhi","Surat");
        Iterator<String> iterator= cities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String city :cities){
            System.out.println(city);
        }

        cities.forEach(city -> System.out.println(city));
        cities.forEach(System.out::println);
    }
}
