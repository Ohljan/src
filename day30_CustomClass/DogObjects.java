package day30_CustomClass;



import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
       Dog dog1 =new Dog();//Dog is the dataType
       dog1.name="Lucy";//lucy is a data
       dog1.breed="Husky";
       dog1.age=2;
       dog1.gender='F';
       dog1.size="small";
       dog1.color="White";


        Dog dog2=new Dog();
        dog2.name="ACE";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Black";
       Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",5,'M',"LARGE","White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
dog1.eat();
dog2.bark();
Dog dog4=new Dog();
dog4.setInfo("bullet","Labrador",3,'M',"Extra Large","Yellow");
Dog dog5=new Dog();
dog5.setInfo("Sully","Pit-Bull",6,'M',"Large","Black");
        System.out.println("-------------------------");
        Dog[] dogs={dog1,dog2,dog3,dog4,dog5};
        ArrayList<Dog> dogsList=new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

     ArrayList<Dog> femaleDogs=new ArrayList<>();
     for (Dog dog : dogsList) {
          if(dog.gender=='F'){
          femaleDogs.add(dog);}
        }


        ArrayList<Dog> maleDogs=new ArrayList<>();
        maleDogs.removeIf(p->p.gender=='F');
        System.out.println("femaleDogs are : " + femaleDogs);
        System.out.println("maleDogs are:" + maleDogs);

    }
}
