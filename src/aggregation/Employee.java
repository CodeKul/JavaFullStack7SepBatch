package aggregation;

public class Employee {
    int empNo;
    String name;
    Address address;
}

class Address {
    String flatNo;
    String street;
    String buildingName;
    String landmark;
    int pinCode;
    String city;

}
class EmpImpl{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.empNo = 111;
        employee.name = "Sumant";

        Address workAddress = new Address();
        employee.address.buildingName = "Bandal Complex";
        workAddress.street = "Paud Road";
        workAddress.city = "Pune";
        workAddress.flatNo = "9/A";
        workAddress.landmark = "Near Kothrud depot";
        workAddress.pinCode = 411038;
        employee.address = workAddress;

        System.out.println("Emp No "+employee.empNo);
        System.out.println("Emp Name "+employee.name);
        System.out.println("Building Name "+workAddress.buildingName);
    }
}