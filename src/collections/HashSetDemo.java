package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");
        set.add("D");
        set.remove("B");
        for(String s: set){
            System.out.println(s);
        }
    }
}
