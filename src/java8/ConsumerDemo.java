package java8;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer no) {
                System.out.println(no * no);
            }
        };
        consumer.accept(5);

        Consumer<Integer> consumer1 = (n) -> {
            System.out.println(n*n);
        };
        consumer1.accept(6);
    }
}
