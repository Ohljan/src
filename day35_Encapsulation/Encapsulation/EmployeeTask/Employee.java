package day35_Encapsulation.Encapsulation.EmployeeTask;

public class Employee {
 public String name;
 public char gender;
 public int age;
 public String jobTitle;
 public int ID;
 public int salary;
 public String companyName;

 public void work(){
     System.out.println(name+" is working");
 }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
employee:
name, gender, age, jobTitle,ID, Salary, companyName,
work(), toString
custom class
Developer
Driver
Teacher
 */