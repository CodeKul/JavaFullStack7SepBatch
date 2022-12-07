package string;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String status = "Hello Everyone!!, Today is Dec 7th!!";
        String[] statuses = status.split(",");
        System.out.println(Arrays.toString(statuses));
        for (String s:statuses){
            System.out.println(s);
        }
    }
}
