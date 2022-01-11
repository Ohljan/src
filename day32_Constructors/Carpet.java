package day32_Constructors;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;
       public Carpet(double width,double length, double unitPrice,boolean isPersian){
           this.width=width;
           this.length=length;
           this.unitPrice=unitPrice;
           this.isPersian=isPersian;
       }
public double calaCost(){
           double totalPrice=(width*length)*unitPrice;
           if (isPersian){//if the condition is true the statement will executed
               totalPrice+=200;
           }
           return totalPrice;
}

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calaCost() +
                '}';
    }
}
