package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer = new Developer("Korkmaz", 29, 'F', 1, "Java Developer",1250000 );
        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);
        Teacher teacher = new Teacher("Daniel", 32, 'F', 3, "Math Teacher", 100000);
        Student student=new Student("Suhaib",30,'M',8,"SDET");
        System.out.println("developer = " + developer);
        System.out.println("tester = " + tester);
        System.out.println("teacher = " + teacher);
        System.out.println("student = " + student);
        System.out.println("---------------------------------");
        developer.setAge(39);// to change the name of the developer ,
        System.out.println(developer.getAge());
        System.out.println(developer);
        System.out.println("----------------------------------------");
        developer.work();
        tester.work();// calling this method do not need to print method again , it s already set the print method in the  parent class
        tester.work();
        System.out.println("--------------------------------------------");
        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();
        System.out.println("--------------------------------------------------");
      tester.eat();
       tester.drink();
        tester.sleep();
       tester.createTicket();
        System.out.println("-----------------------------------------");
        teacher.eat();
        teacher.drink();
        teacher.sleep();
       teacher.work();
        System.out.println("---------------------------------------------");
        student.eat();
        student.drink();
        student.sleep();
        student.study();



    }
}