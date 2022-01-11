package day37_Inheritance.scrumTask;

public class Person {
    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink (String drink){
        System.out.println(name+" is drinking "+ drink);
    }

    public String
    toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static class Developer extends Employee{
        public Developer(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
            super(name, age, gender, jobTitle, ID, salary, companyName);
        }
        public void fixBugs(){
            System.out.println(jobTitle+" "+name+" is writing code to fix the bugs");
        }
    }
}
