package collections;

import java.util.Set;
import java.util.TreeSet;

public class PersonSetImpl {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1,"Nilesh",50));
        personSet.add(new Person(2,"Nitin",29));
        personSet.add(new Person(3,"Pankaj",44));

        for (Person p:personSet){
            System.out.println(p.toString());
        }
    }
}

class Person implements Comparable<Person>{
    private Integer id;
    private String name;
    private Integer age;
    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        if (age>p.age)
            return 1;
        else if(age<p.age)
            return -1;
        return 0;
    }
}