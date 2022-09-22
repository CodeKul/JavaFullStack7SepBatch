package controlflowstatement;

import java.util.Scanner;

public class DivisibilityOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int no = sc.nextInt();

        if (no % 3 == 0 && no % 5 == 0) {
            System.out.println("Given no is divisible by 3 & 5");
        } else if (no % 3 == 0) {
            System.out.println("Given no is divisible by 3 only");
        } else if (no % 5 == 0) {
            System.out.println("Given no is divisible by 5 only");
        }
    }
}
