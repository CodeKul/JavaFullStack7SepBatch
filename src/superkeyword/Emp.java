package superkeyword;

public class Emp {
    int empNo;
    String name;

    public Emp(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }
}
class Teacher extends Emp{
    double salary;

    public Teacher(int empNo, String name, double salary) {
        super(empNo, name);
        this.salary = salary;
    }

    void display(){
        System.out.println("EMP No "+empNo);
        System.out.println("EMP Name "+name);
        System.out.println("EMP Salary "+salary);
    }
}
class EmpImpl{
    public static void main(String[] args) {
        Teacher teacher = new Teacher(121,"Suraj",50000);
        teacher.display();
    }
}