package arrays;

import java.util.Scanner;

public class AddTwoMatricesDemo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        int array[][] = {{1,2,3},{1,2,3},{1,2,3}};

        System.out.println("Enter first matrix element");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix element");
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of two Matrices\n");
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c.length;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
    }
}
