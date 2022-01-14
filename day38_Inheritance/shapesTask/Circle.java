package day38_Inheritance.shapesTask;

public class Circle extends Shape {
    public Circle( double r) {
        super("Circle");
        this.r = r;
    }

    private double r;
    public static double pi=3.14;
    /*
    variable : redius (private)
    pi:
    encapsulate the field
    add a constructor to set the field
    area(): radius *radius*pi
    perimeter(): 2*radius*pi;
     */






