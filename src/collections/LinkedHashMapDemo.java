package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(101,"Amit");
        map.put(102,"Suresh");
        map.put(103,"Pankaj");
        map.put(103,"Shweta");
        map.put(null,null);
        map.remove(102);
        for (Map.Entry entry : map.entrySet()){
            System.out.println(" " + entry.getKey() + "  "+ entry.getValue());
        }
    }
}
