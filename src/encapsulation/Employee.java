package encapsulation;

public class Employee {
    private int empId;
    private String name;
    private String companyName = "Codekul Pvt. Ltd.";
    private String address;
    private Double salary;
    private Double bonus = 1000d;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBonus() {
        return bonus;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 50000)
        this.salary = salary + getBonus();
        else
            this.salary = salary;
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpId(101);
        employee.setName("Ash");
        employee.setAddress("Kothrud,Pune");
        employee.setSalary(59000d);
        System.out.println("EMP ID : "+ employee.getEmpId());
        System.out.println("EMP NAME : "+ employee.getName());
        System.out.println("COMPANY NAME : "+ employee.getCompanyName());
        System.out.println("Salary : "+ employee.getSalary());

    }
}