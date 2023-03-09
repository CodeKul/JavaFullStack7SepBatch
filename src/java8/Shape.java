package java8;

@FunctionalInterface
public interface Shape {
    void calculate();
}


class CircleImpl{
    public static void main(String[] args) {
//        Shape shape = new Shape() {
//            @Override
//            public void calculate() {
//                System.out.println(2*3.14*5*5);
//            }
//        };
//        shape.calculate();

        Shape shape = () -> {
            System.out.println(2*3.14*5*5);
            };
        shape.calculate();
    }
}