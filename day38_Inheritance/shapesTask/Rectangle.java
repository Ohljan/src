package day38_Inheritance.shapesTask;

public class Rectangle extends Shape {
    public Rectangle() {
        super("Rectangle");


    }


    public double width;
    public double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width<=0){
            return;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        if (length<=0){
            return;
        }
    }
}

/*
variables: length, width(private) encapsulate the field
area(): width*length
perimeter(): 2*(width +length)
toString():length, width are and perimeter
 */