package common;

import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();
        SquareDemo s = new SquareDemo();
        int result = s.calculateSquare(no);
        System.out.println("Square of "+no +" is "+result);
    }
    int calculateSquare(int no){
        int result = no * no;
        return result;
    }
}
