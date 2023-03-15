package java8;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortMr {
    public static void main(String[] args) {
        String[] names = {"Tom","Jerry","Nobita","Doremon","ShinChan"};
        Arrays.sort(names,String::compareToIgnoreCase);
        for (String n : names){
            System.out.println(n);
        }
    }

}
