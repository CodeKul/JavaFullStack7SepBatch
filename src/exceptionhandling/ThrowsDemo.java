package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    void m1() throws FileNotFoundException {
        throw new FileNotFoundException("File Not Found");
    }
    void m2() throws FileNotFoundException{
            m1();
    }
    void m3() {
        try {
            m2();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.m3();
    }
}
