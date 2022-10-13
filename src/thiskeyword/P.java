package thiskeyword;

import java.util.Scanner;

/**
 * 4. can be passed as argument in the constructor call
 */
public class P {
    R r;
    P(R r){
        this.r = r;
    }
    void show(int data,String operation){
        System.out.println(operation+" " +(data+10));
    }

}
class Q{
    R r;
    Q(R r){
        this.r = r;
    }
    void display(int data,String operation){
        System.out.println(operation+" "+(data*2));
    }
}
class R {
    int data = 50;
    String operation = "Calculation";

    R(){
        P p = new P(this);
        p.show(data,operation);
        Q q = new Q(this);
        q.display(data,operation);
    }
}

class PImpl{
    public static void main(String[] args) {
       R r = new R();

    }
}