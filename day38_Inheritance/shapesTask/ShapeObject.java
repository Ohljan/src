package day38_Inheritance.shapesTask;

public class ShapeObject {
    public static void main(String[] args) {
        Square square=new Square(3.5);
        square.setSide(10);
        System.out.println(square.getName());
        System.out.println(square);
        //  square.side=-100000;
        System.out.println("==================================");
        Rectangle rectangle=new Rectangle(5,6);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        System.out.println("---------------------------------------------");
        Circle circle=new Circle(1.5);
        System.out.println(circle.getName());
        System.out.println(circle);
    }
}
