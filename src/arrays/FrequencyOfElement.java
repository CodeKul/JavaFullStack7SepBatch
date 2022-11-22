package arrays;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,1,2,1};
        int freq[] = new int[array.length];
        int visited = -1;
        for (int i=0;i< array.length;i++){
            int cnt = 1;
            for (int j=i+1;j< array.length;j++){
                if (array[i] == array[j]){
                    cnt++;
                    freq[j] = visited;
                }
            }
            if (freq[i]!=visited)
                freq[i] = cnt;
          //  System.out.println(array[i]+" "+cnt);
        }
        System.out.println();
        for (int i=0;i< freq.length;i++){
            if (freq[i]!=-1)
              System.out.println(array[i] +" "+freq[i]);
        }

    }
}


