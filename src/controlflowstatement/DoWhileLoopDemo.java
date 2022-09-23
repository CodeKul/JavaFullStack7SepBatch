package controlflowstatement;

/**
 * do block is executed at least once, even if the
 * condition is false
 */
public class DoWhileLoopDemo {
    public static void main(String[] args) {
       int i = 5;
        do{
            System.out.println("Welcome "+i);
            i++;
        }while(i<5);
    }
}
