package polymorphism;

public class Employee {
    void calculateSalary(){
        System.out.println("Salary is 78000");
    }
}
class Programmer extends Employee{
    void calculateSalary() {
        System.out.println("Salary id 100000");
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.calculateSalary();
    }
}