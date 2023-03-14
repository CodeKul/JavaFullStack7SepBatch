package java8;

import java.util.Scanner;
@FunctionalInterface
public interface ShapeSquare {
    void calculateArea(int side);
}
class SquareImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side value");
        int no = sc.nextInt();
        ShapeSquare shapeSquare = new ShapeSquare() {
            @Override
            public void calculateArea(int side) {
                System.out.println("Area "+side*side);
            }
        };
        shapeSquare.calculateArea(no);

        //lambda
        ShapeSquare s = (side) ->{
            System.out.println("Area in lambda"+side*side);
        };
        s.calculateArea(no);
    }
}
