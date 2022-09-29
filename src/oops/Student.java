package oops;

public class Student {
    int rollNo;
    String name;
    int age;

    void showData(){
        System.out.println("Roll No "+rollNo);
        System.out.println("Name  "+name);
        System.out.println("Age  "+age);
    }

    public static void main(String[] args){
        Student s1; // reference variable
        s1 = new Student(); // memory allocation for s1
        s1.rollNo = 1;
        s1.name = "Apeksha";
        s1.age = 20;
        s1.showData();
    }
}
