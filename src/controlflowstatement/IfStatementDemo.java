package controlflowstatement;

/**
 * 1. Simple If
 * 2. If Else
 * 3. if-else-if ladder
 * 4. Nested-if
 */
public class IfStatementDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        if (x>y)
            System.out.println("X is greater than Y");

        if(x<y)
            System.out.println("Y is greater than X");
        else
            System.out.println("X is greater than Y");

        String state = "Goa";
        if (state == "Bihar")
            System.out.println("State is Bihar");
        else
            if (state == "Maharashtra")
                System.out.println("State is Maharashtra");
            else
                if (state == "Goa")
                System.out.println("State is Goa");
                else
                    System.out.println("State is "+state);


        String city = "Pune";
        if (state == "Maharashtra")
            if (city == "Pune") {
                System.out.println("Pune is clean city");
                System.out.println("Pune is in MH");
            }
            else
                if (city == "Mumbai")
                System.out.println("Mumbai is in MH");
            else
                System.out.println("Your city is not listed in MH");
        else
            if (state == "Goa")
                if (city == "Panji")
                    System.out.println("Panji is in Goa");
            else
                    System.out.println("Invalid data");
    }
}
