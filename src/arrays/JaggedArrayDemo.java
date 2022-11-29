package arrays;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        int arr[] [] = new int[3][];
        arr[0]= new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        int cnt = 0;
        //Initializing the array
        System.out.println("Size "+arr.length);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = cnt++;
            }
        }
        ///Display array
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
