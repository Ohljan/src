package day43_Abstraction.employeeTask;

import jdk.swing.interop.SwingInterOpUtils;

public final class Driver extends Employee {
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving trucks to US");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping inside of the truck.");
    }

}
