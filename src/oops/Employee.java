package oops;

public class Employee {
    String empCode;
    String name;
    String companyName;
    void showData(){
        System.out.println("EMP Code"+empCode);
        System.out.println("EMP Name"+name);
        System.out.println("Company Name"+companyName);
    }
}

class EmployeeImpl {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.companyName = "Codekul";
        e1.empCode = "E001";
        e1.name ="Aditya";
        e1.showData();
    }
}
