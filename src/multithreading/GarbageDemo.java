package multithreading;

import accessmodifiers.pack3.Person;

public class GarbageDemo {
    public static void main(String[] args) {
        // by nulling the reference
        Person person = new Person();
        person = null;

        // By assigning reference to another
        Person p1 = new Person();
        Person p2 = new Person();
        p1 = p2;

        //By anonymous object
        new Person();



    }
}
