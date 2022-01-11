package day32_Constructors;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Aaron");
        Employee employee2=new Employee("Yuliya",'F');
        Employee employee3=new Employee("olga",'F',"QA");
        Employee employee4=new Employee("");
        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);


    }
}
