package superkeyword;

/**
 * 3. to invoke immediate parent class constructor
 */
public class Employee {
    Employee(){
        System.out.println("Employee is created");
    }
}
class Programmer extends Employee{
    Programmer(){
        super(); //super() is added in class constructor automatically
        //by compiler if there is no super()
        System.out.println("Programmer is created");
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
    }
}