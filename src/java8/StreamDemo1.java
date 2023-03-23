package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //map
        List<Integer> list = Arrays.asList(3,5,6,9,11,18,25,36,43,52,63,71,88,95);
        Stream<Integer> stream = list.stream().map(n->n*5);
        stream.forEach(System.out::println);

        //filter
        list.stream().filter(n->n<50).forEach(System.out::println);

        //min
        Stream<Integer> numbers = list.stream();
        Integer min = numbers.min((n1,n2)->n1<n2?-1:1).get();
        System.out.println("Min Value: "+min);

        //max
        Integer max = list.stream().max((n1,n2) -> n1>n2?1:-1).get();
        System.out.println("Max Value: "+max);

        //sum
      //  list.stream().reduce()

        //count
        Long count = list.stream().count();
        System.out.println("Count: "+count);

        List<Integer> integers = Arrays.asList(5,1,2,3,4,5,4);
        Set<Integer> set = integers.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);

    }
}
