package day37_Inheritance.scrumTask;

       public class Employee extends Person{
       public String jobTitle;
      public int ID;
      public double salary;
      public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender);// this part is from person class
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(jobTitle+" "+name+ " is working");
    }

           public String toString() {// to be able to print the employee object
               return "Employee{" +
                       " name='" + name + '\'' +
                       ", age=" + age +
                       ", gender=" + gender +
                       ", ID=" + ID +
                       "jobTitle='" + jobTitle + '\'' +
                       ", salary=" + salary +
                       ", companyName='" + companyName + '\'' +
                       '}';
           }
       }
