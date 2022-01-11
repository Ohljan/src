package day31_Constructor;



public class PersonClass {
    public static void main(String[] args) {
        Person person1=new Person("Daniel",'M',32);
       Person person2=new Person("Kseniia",'F',28);

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        person2.age=30;// if we want to change it , if want to change entire better to add new person again


    }
}
