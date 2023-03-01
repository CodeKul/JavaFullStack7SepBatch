package collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        SortedMap<String,Double> map = new TreeMap<>();
        map.put("Radha",98.5);
        map.put("Rohit",91.5);
        map.put("Rahul",89.6);
        map.put("Akshay",null);
        for (Map.Entry entry : map.entrySet()){
            System.out.println(" " + entry.getKey() + "  "+ entry.getValue());
        }
    }
}
