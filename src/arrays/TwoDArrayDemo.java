package arrays;

import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        //declaration
        int[][] a1;
        int [][]a2;
        int a3[][];
        int []a4[];

        //instantiate
        a1 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a1[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
