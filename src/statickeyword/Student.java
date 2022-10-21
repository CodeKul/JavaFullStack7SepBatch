package statickeyword;

public class Student {
    Integer rollNo;
    String name;
    static String schoolName = "St. Joseph School ";

    public Student(Integer rollNo, String name,String schoolName) {
        this.rollNo = rollNo;
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName;
    }
}
class StudentImpl{
    public static void main(String[] args) {

        Student s1 = new Student(1,"Amit","St. Joseph School");
        Student s2 = new Student(2,"Vaibhav","St. Joseph School");
        Student s3 = new Student(3,"Kavita","Central School");
        Student s4 = new Student(4,"Pooja","Central School");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}