package collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vectors = new Vector<>();
        vectors.add("C++");
        vectors.add("Java");
        vectors.add("Data Structure");
        vectors.add("Python");
        vectors.add(3,"VB");

        System.out.println(vectors);
        System.out.println("vectors.get(2) "+vectors.get(2));
        System.out.println("vectors.remove(1):"+vectors.remove(1));

        System.out.println(vectors.contains("Python1"));
    }
}
