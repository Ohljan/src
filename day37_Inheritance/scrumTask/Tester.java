package day37_Inheritance.scrumTask;

public class Tester extends Employee{// tester is A Emploee . is a relationship
    public Tester(String name, int age, char gender, String jobTitle, int ID, double salarty, String companyName) {
        super(name, age, gender, jobTitle, ID, salarty, companyName);
    }
    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }
}
