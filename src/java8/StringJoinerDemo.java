package java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("-");
        joiner.add("A");
        joiner.add("B");
        joiner.add("C");
        joiner.add("D");
        joiner.add("E");
        System.out.println(joiner);

        StringJoiner stringJoiner = new StringJoiner("-","[","]");
        stringJoiner.add("A");
        stringJoiner.add("B");
        stringJoiner.add("C");
        stringJoiner.add("D");
        stringJoiner.add("E");
        System.out.println(stringJoiner);
    }
}
