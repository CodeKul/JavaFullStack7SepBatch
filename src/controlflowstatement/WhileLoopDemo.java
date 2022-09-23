package controlflowstatement;

/**
 * to iterate a part of program repeatedly
 */
public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            System.out.println("Welcome "+i);
            i++;
        }
        //Infinite Loop
//        while (true){
//            System.out.println("Infinite Loop");
//        }
    }
}
