package day35_Encapsulation.Encapsulation.encapsulation;


public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Daniel",29,'M','D',"MIT");
       student1.setAge(39);// the age will become 39 after this set
        System.out.println("student1 = " + student1);
    }
}
