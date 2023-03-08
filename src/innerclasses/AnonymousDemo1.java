package innerclasses;

abstract class Student{
    abstract void show();
}

public class AnonymousDemo1 {
    public static void main(String[] args) {
        Student student = new Student() {
            @Override
            void show() {
                System.out.println("in show method");
            }
        };
        student.show();
    }

}
