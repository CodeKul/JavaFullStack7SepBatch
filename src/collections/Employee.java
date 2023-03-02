package collections;

import java.util.Comparator;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;

    public Employee(Integer id, String name, Integer age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }
}
class AgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getAge() < e2.getAge())
            return 1;
        else if (e1.getAge() > e2.getAge())
            return -1;
        return 0;
    }
}

class EmployeeImpl{
    public static void main(String[] args) {

    }
}