package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyato toyato=new Toyato("Camry",2020,20000," Gray",123456);
        Tesla tesla=new Tesla("Model S",2022,94990,"Red",0);
        BMW bmw=new BMW("X5",2020,54000,"Black",12000);
         toyato.start();
         tesla.start();
         bmw.start();
    }
}
