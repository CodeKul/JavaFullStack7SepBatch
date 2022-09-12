package common;

/**
 * a container which holds the value
 * assigned with a data type
 * name memory location
 * Types of variable
 * 1. local variable
 *      - declared inside the method body
 * 2. instance variable
 *      - declared inside the class but outside the body of the method
 * 3. static variable
 *      - declared inside the class but outside the body of the method and declared with static keyword
 *      - cannot be local
 *
 */
public class Variables {
    int no = 50; // instance variable
    static int no1 = 60;

    public static void main(String[] args) {
        int a = 60; //local variable
    }
}
