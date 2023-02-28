package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("Class A",50);
        map.put("Class B",60);
        map.put("Class C",70);
        map.put("Class B",80);
        map.put("Class D",70);
        map.put(null,50);
        map.put(null,60);
        System.out.println(map);
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());

        }
    }

}
