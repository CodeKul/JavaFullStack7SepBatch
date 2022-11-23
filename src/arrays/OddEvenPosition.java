package arrays;

public class OddEvenPosition {
    public static void main(String[] args) {
        int array[] = new int[]{5,8,10,53,34,60,23};

        //Even pos
        System.out.println("Even position numbers");
        for (int i=0;i<array.length;i=i+2){
            System.out.println(array[i]);
        }
        //Odd pos
        System.out.println("Odd position numbers");
        for (int i=1;i<array.length;i=i+2){
            System.out.println(array[i]);
        }
    }
}
