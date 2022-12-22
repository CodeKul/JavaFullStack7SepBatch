package exceptionhandling;

import java.util.Scanner;

public class VaccineCriteriaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer age = sc.nextInt();
        if (age < 60){
            throw new ArithmeticException("Not Eligible");
        }else {
            System.out.println("Eligible");
        }

    }
}
