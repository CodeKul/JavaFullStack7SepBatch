package inheritance;

/**
 * Single Inheritance
 */
public class Employee {
    int id = 1;
    String name = "Pooja";
    float salary = 50000;

}
class Programmer extends Employee{
    float bonus = 5000;

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        float totalSalary = programmer.salary + programmer.bonus;
        System.out.println("Total Salary of "+programmer.name+" is "+totalSalary);
    }
}
