package SelfStudy.Inherit;

public class Employee extends Person {
    public int ID;
    public String jobTitle;
    public int salaray;

    public void setInfo(String name,int age, char gender,int ID, String jobTitle, int salaray) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salaray = salaray;
    }
public void work(){
    System.out.println(name+" is working");
}
    public String name() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String age() {
        return "Employee{" +
                "age=" + age +
                '}';
    }

    public String gender() {
        return "Employee{" +
                "gender=" + gender +
                '}';
    }

    public String ID() {
        return "Employee{" +
                "ID=" + ID +
                '}';
    }

    public String JobTitle() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public String Salary() {
        return "Employee{" +
                "salaray=" + salaray +
                '}';
    }
}
