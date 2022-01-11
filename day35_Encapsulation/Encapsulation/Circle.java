package day35_Encapsulation.Encapsulation;

public class Circle {
    private double radius;
    private static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }
    public double calaArea(double radius){
        return pi*(radius*radius);
    }
    public double calaPerimeter(double radius){
        return  2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
/*
encapsulate all the private fields
1. radius of the circle can not be zero or negative
add a constructor that can set the radius of circle when circle object is created
method
calcArea
calcPerimeter
toString
 */