package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();//Car is the dataType
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        car1.setInfo("BMW","C300","Griy",2016,21000);

       car2.setInfo("Audi","Q7","Black",2021,17000);

       car3.setInfo("Toyota","Camry","White",2021,35000);

       car4.setInfo("Mazda","A6","Red",2020,32000);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        ArrayList<Car>carsList=new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3,car4));
        for (Car each:carsList){
            System.out.println(each.brand+" : "+each.price);
        }
        System.out.println("----------------------------");
        carsList.removeIf(p->p.brand.equals("BMW")&& p.year>=2005&&p.year<=2008);
        carsList.removeIf(p->p.brand.equals("Toyota")&& p.year>=1995 && p.year<=1997);

    }
}
