package controlflowstatement;

/**
 *  similar to if-else-if statement
 *  multiple blocks of code (case)
 *  easier to use instead of if-else-if
 *  case variables can be int,short,byte,char
 *  from 1.7 we can use String
 *  cases cannot be duplicate
 *
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int a = 4;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println(a);
        }

    }
}
