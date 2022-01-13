package day38_Inheritance.carTask;

public class Toyato extends Car {
    public Toyato(String brand, int year, double price, String color, int miles) {
        super(brand, "Toyato", year, price, color, miles);
    }

    public void reliable() {
        System.out.println(brand + " " + model + " is reliable");
    }
public void start(){
    System.out.println("Twist the key to ignition to start "+brand+" "+model);
}
}

