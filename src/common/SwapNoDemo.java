package common;

import java.util.Scanner;

public class SwapNoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int no1 = sc.nextInt();
        System.out.println("Enter 2nd no");
        int no2 = sc.nextInt();
        SwapNoDemo s1 = new SwapNoDemo();
        s1.swap(no1,no2);
    }
    void swap(int n1,int n2){
        System.out.println("Before Swap No1:"+n1 +" No2 "+n2);
        int temp;
        temp =  n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After Swap No1:"+n1 +" No2 "+n2);
    }
}
