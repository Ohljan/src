package day35_Encapsulation.Encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
      Employee employee1=new Employee("Titiana",'F',28,120000);
      //  System.out.println(employee1);
       employee1.setAge(32);// after this the age will change to 32
       // System.out.println(employee1);
        Employee employee2=new Employee("Aygun",'F',31,115000);
    employee2.setSalary(employee2.getSalary()+15000);
     employee2.setName("Huyle");
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
