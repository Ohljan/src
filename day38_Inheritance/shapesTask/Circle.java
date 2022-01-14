package day38_Inheritance.shapesTask;

public class Circle extends Shape {
    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println(" invalid radius :"+radius);
            System. exit(1);
        }
        this.radius= radius;
    }

    public Circle( double radius) {
        super("Circle");
       setRadius(radius);
    }


    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius *pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "pi=" + pi +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}






    /*
    variable : redius (private)
    pi:
    encapsulate the field
    add a constructor to set the field
    area(): radius *radius*pi
    perimeter(): 2*radius*pi;
     */






