package innerclasses;

interface Shape{
    void calculateArea();
}
public class AnonymousDemo2 {
    public static void main(String[] args) {
        Shape shape = new Shape(){
            @Override
            public void calculateArea() {
                System.out.println("Area calculated");
            }
        };
        shape.calculateArea();
    }
}
