package day35_Encapsulation.Encapsulation.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender;
    private char grade;
    private  String schoolName;


    public String getName(){
    return name;
}
    public void  setName(String name){
    this.name=name;
}
    public int getAge(){
    return age;
}
   public void setAge(int age){
  if (age<5 || age>90){// the student can not be one age and at the same has another age so need to use ||
      return;      //exit the method
     }
          this.age=age;
}

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
    if (!(gender=='M'|| gender=='F')){
        return;
    }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
    if (!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
        return; // exits the method
    }
        this.grade = grade;
    }

    public  String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
       this.schoolName=schoolName;
    }

    public Student(String name, int age, char gender, char grade,String schoolName) {
        setName(name);
        setAge(age);// if here is : this.age=age, will not check the condition
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }
    public void study(){
        System.out.println(name+" is studing");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
