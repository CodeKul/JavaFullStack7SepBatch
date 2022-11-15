package interfacedemo;

import java.util.List;

public interface Shape extends Drawable{
   int radius =  50;
   void calculateArea();
}
 interface Drawable{
    void getDrawable();
}
class Circle implements Shape{
   public int radius = 5;
  @Override
  public void calculateArea() {
    double res = 3.14 * radius * radius;
    System.out.println(res);
  }

    @Override
    public void getDrawable() {
        System.out.println("Circle Object");
    }
}
class ShapeImpl{
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea();
    }
}