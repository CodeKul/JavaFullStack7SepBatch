package collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Days,Integer> map = new EnumMap<>(Days.class);
        map.put(Days.Monday,1);
        map.put(Days.Tuesday,2);
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
}
