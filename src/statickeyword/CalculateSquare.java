package statickeyword;

import java.util.Scanner;

public class CalculateSquare {
    static int square(int no){
        return no * no;
    }
}

class SquareImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. ");
        int no = sc.nextInt();
        int res =  CalculateSquare.square(no);
        System.out.println("Square of "+no + " is "+res);
    }
}