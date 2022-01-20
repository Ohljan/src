package day39_Recap.cydeoTask;

public class Employee extends Person{
    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee( String name ,int age, char gender, int employeeId,String jobTitle,double salary) {
        super(name, age, gender);
      setEmployeeId(employeeId);
      setSalary(salary);
      setJobTitle(jobTitle);
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public void setEmployeeId(int employeeId) {
        if (employeeId==0){
            System.err.println("employeId: "+ employeeId);
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()|| jobTitle.isEmpty()){
            System.err.println("Invalid jobTitle: "+ jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        if (salary<0){
            System.err.println("Invalid salary: "+ salary);
            System.exit(1);
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println(getName()+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name=" + getName()+
                ", gender=" + getGender()+
                ", age=" + getAge() +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
extra vavriables: emplyeeId , jobTitle, salary
encapsulate all the field
add a constructor to set all the field
method: work();tostring
 */