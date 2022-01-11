package SelfStudy.Inherit;

public class Developer extends Employee{
    public void unitTest(){
        System.out.println(name+" is doing unit testing");
    }
    public void integrationTest(){
        System.out.println(name +" is doing integration testing");
    }
    public void writeCode(){
        System.out.println(name+" is writing the code ");
    }
}
