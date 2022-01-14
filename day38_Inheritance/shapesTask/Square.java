package day38_Inheritance.shapesTask;

public class Square extends Shape {
    private double side;
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if (side<=0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}

/*
square extends shapes :
variables: side (private then use the setter to end the condition)
encapsulate the field
area(): side*side
perimeter(): side*4
override the toString method from the object class
 */
