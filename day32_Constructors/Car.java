package day32_Constructors;

public class Car {
    public String brand, model;
    public  int year;
    public double price;
    public String color;


    // first constructor
    public Car(String brand) {
        this.brand = brand;
    }
    // second constructor
    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }
    // third constructor
    public Car(String brand, String model, int year) {
       this(brand,model);
        this.year = year;
    }
    // fourth  constructor
    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }
    // fifth constructor
    public Car(String brand, String model, int year, double price, String color) {
        this(brand, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
