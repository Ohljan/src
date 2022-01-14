package day38_Inheritance.shapesTask;



public class ShapeObject {
    public static void main(String[] args) {
        Circle circle1=new Circle(2.5);
        Rectangle rectangle1=new Rectangle();
        Square square1=new Square();
        square1. side=3.6;
        rectangle1.length=2.5;
        rectangle1.width=4.5;

        circle1.area();
        rectangle1.area();
        square1.perimeter();
        System.out.println("circle1 = " + circle1);
        System.out.println("square1 = " + square1);
        System.out.println("rectangle1 = " + rectangle1);

    }
}
