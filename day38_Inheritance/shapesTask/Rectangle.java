package day38_Inheritance.shapesTask;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("invalid width");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("invalid lenght");
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle( double width, double length) {
         super("Rectangel");
         setLength(length);
         setWidth(width);
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}




/*
variables: length, width(private) encapsulate the field
area(): width*length
perimeter(): 2*(width +length)
toString():length, width are and perimeter
 */