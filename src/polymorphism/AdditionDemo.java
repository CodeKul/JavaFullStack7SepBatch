package polymorphism;

public class AdditionDemo {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(float a,int b){
        return a+b;
    }
    float add(int a,float b){
        return a+b;
    }
    double add(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        AdditionDemo demo = new AdditionDemo();
        demo.add(10.5f,20.5f);
    }
}
