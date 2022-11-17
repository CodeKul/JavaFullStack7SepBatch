package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int array [] = new int[5];
        System.out.println("Array "+array);
        array[0] = 10;
        array[3] = 40;

        for(int a:array){
            System.out.print(a+" ");
        }

        System.out.println("4th Position element "+array[3]);
    }
}
