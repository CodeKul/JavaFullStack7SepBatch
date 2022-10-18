package polymorphism;

public class Employee {
    void calculateSalary(){
        System.out.println("Salary is 78000");
    }
    static void getBonus(){
        System.out.println("Bonus is 500");
    }
}
class Programmer extends Employee{

    @Override
   void calculateSalary() {
       System.out.println("Salary is 1 Lac");
   }

    //getBonus method can not be over-ride because this method is static
}
class EmployeeImpl{
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.calculateSalary();
    }
}