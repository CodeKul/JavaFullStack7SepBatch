package java8;

import java.util.function.BiFunction;

/**
 * Method Reference to a static method
 */
public class AdditionDemo {
    public static Integer addition(Integer x,Integer y){
        return x+y;
    }
}

class AdditionImpl{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>  biFunction = AdditionDemo::addition;
        Integer result = biFunction.apply(11,6);
        System.out.println(result);
    }
}