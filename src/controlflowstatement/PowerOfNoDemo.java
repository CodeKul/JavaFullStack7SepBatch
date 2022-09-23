package controlflowstatement;

public class PowerOfNoDemo {
    public static void main(String[] args) {
        int power = 4;
        int no = 2;
        int result = 1;
        while (power > 0){
            result = result * no;
            power --;
        }
        System.out.println(result);
    }
}
