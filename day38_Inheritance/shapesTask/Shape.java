package day38_Inheritance.shapesTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name==null){
            System.err.println("invalid name");
            System.exit(1);// 1: something went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty");
            System.exit(1);
        }
        this.name = name;
    }
    public Shape(String name){
        setName(name);
 }

    public  double area(){
      return 0;
    }
    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area()+ '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*Shape:
	variable:
		name(private)
		Encapsulate the field
Add A constructor to set the filed
Methods:
		area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter


Circle
	r
	pi

	toString(): name, r, pi, area, perimeter

Square
	s

	toString(): name, s, area, perimeter

Rectangle
	l
	w

	toString(): name, l, w, area, perimeter

....





 */