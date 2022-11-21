package arrays;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5,2,2,3,4,5,6,7,8,8,9};
        int freq[] = new int[array.length];
        for (int i=0;i< array.length;i++){
            int cnt = 1;
            for (int j=i+1;j< array.length;j++){
                if (array[i] == array[j]){
                    cnt++;

                }
            }
            System.out.println(array[i]+" "+cnt);
        }


    }
}
