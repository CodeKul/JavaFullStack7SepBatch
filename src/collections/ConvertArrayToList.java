package collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"Apple","Banana","Kiwi"};
        List<String> list = new ArrayList<>();

        for (String s:arr){
            list.add(s);
        }
        System.out.println(list);

        String[] fruitsArray = (String[]) list.toArray();

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

       Integer[] nums =  (Integer[]) integers.toArray();

     }
}
