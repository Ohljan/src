package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender,  int ID, double salary, String companyName) {
        super(name, age, gender, "Product Owner", ID, salary, companyName);
    }
    public void meet(){
        System.out.println(jobTitle+" "+name+" is meeting  clients ");
    }
}
