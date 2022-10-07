package inheritance;

/**
 * Hierarchical Inheritance
 */
public class Teacher {
    int id;
    String name;
    String subject;
}
class PhysicsTeacher extends Teacher{
    double salary= 5000;
}
class MathsTeacher extends Teacher{
    double salary = 7000;
}

class TeacherImpl{
    public static void main(String[] args) {
        PhysicsTeacher pt = new PhysicsTeacher();
        pt.id = 1;
        pt.name = "M.K.Patil Sir";
        pt.subject = "Physics";
        System.out.println(pt.id +" "+pt.name+" "+pt.subject+" "+ pt.salary);

        MathsTeacher mt = new MathsTeacher();
        mt.id = 2;
        mt.name = "P.G.Patel";
        mt.subject = "Maths";
        System.out.println(mt.id +" "+mt.name+" "+mt.subject+" "+ mt.salary);

    }
}