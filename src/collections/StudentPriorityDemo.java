package collections;

import java.util.Objects;
import java.util.PriorityQueue;

public class StudentPriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(new Student("ADM-001","Trupti",8.2));
        students.add(new Student("ADM-002","Aakash",8.9));
        students.add(new Student("ADM-003","Tejas",9.5));
        students.add(new Student("ADM-004","Rohan",9.7));
        students.add(new Student("ADM-005","Ketki",8.0));

        while (!students.isEmpty()) {
            System.out.println(students.remove());
        }

    }
}
class Student implements Comparable<Student>{
    private String admissionNo;
    private String name;
    private Double cgpa;

    public Student(String admissionNo, String name, Double cgpa) {
        this.admissionNo = admissionNo;
        this.name = name;
        this.cgpa = cgpa;
    }



    @Override
    public String toString() {
        return "Student{" +
                "admissionNo='" + admissionNo + '\'' +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if (cgpa < s.cgpa)
            return 1;
        else if (cgpa > s.cgpa)
            return -1;
        return 0;
    }
}
