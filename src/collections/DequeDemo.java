package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> fruits = new ArrayDeque<>();
        fruits.addFirst("Apple");
        fruits.addLast("JackFruit");
        fruits.offerLast("Pomegranate");
        fruits.offerFirst("Mango");
        fruits.addFirst("Banana");
        //fruits.add(null);
        for (String s: fruits){
            System.out.println(s);
        }
    }
}
