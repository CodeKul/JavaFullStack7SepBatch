package collections;

public class GenericBoundedType<T extends Number> {
    void display(){
        System.out.println();
    }

    public static void main(String[] args) {
        GenericBoundedType<Integer> boundedType1 = new GenericBoundedType();
        GenericBoundedType<Double> boundedType2 = new GenericBoundedType();
      //  GenericBoundedType<String> boundedType = new GenericBoundedType();
    }
}
