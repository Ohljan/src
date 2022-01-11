package day35_Encapsulation.Encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
         setName(name);// in this case it will go with the condition we set , if it s not valid it will not executed
         setGender(gender);// change the this. key word to set will executed with the condition we set with the if statment
         setAge(age);// to make sure the all variable entered is valid
         setSalary(salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
           return;// if the name is empty will skip , empty stream will not set to the name
        }
        this.name = name;
    }


    public char getGender() {

       return gender;
    }

    public void setGender(char gender) {
        if ( !(gender=='F'|| gender=='M')){
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<16 || age>90){
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            return;
        }
        this.salary = salary;
    }

}
/*
encapsulate all the private fields
1. name can not be empty
2. gender can not be anything other than female or male
3 age can not be less than 16 ,and greter than  90
4 salary can not be zero or negative
 */

