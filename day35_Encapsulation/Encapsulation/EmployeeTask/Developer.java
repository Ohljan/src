package day35_Encapsulation.Encapsulation.EmployeeTask;

public class Developer extends Employee{
    public void unitTest(){
        System.out.println(name+" is doing the unit testing");
    }
    public void integrationTest(){
        System.out.println(name+" is doing the integration testing ");
    }
}
