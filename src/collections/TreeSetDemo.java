package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(50);
        integers.add(40);
        integers.add(90);
        integers.add(10);
        integers.add(30);
        integers.add(20);
        Iterator iterator = integers.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
