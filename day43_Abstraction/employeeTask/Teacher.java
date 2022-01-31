package day43_Abstraction.employeeTask;

public class Teacher extends Employee {
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching the  students");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 10 hours a day");
    }
    public void checkWord(){
        System.out.println(getName()+" is checking the homework of students");
    }
}
