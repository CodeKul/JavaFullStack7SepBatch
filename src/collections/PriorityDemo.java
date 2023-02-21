package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(50);
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);
        numbers.offer(40);
        System.out.println(numbers);
        System.out.println(numbers.peek());
    }
}
