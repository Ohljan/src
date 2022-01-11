package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender,  int ID, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", ID, salary, companyName);
    }
    public void hostMeeting(){
        System.out.println(jobTitle+" "+name+" is hosting the stand up meeting ");
    }

    public static class BusinessAnalyst extends Employee{
        public BusinessAnalyst(String name, int age, char gender,  int ID, double salarty, String companyName) {
            super(name, age, gender, "Business Analyst" , ID, salarty, companyName);
        }
        public void anaylize(){
            System.out.println(jobTitle+" "+name+ " is analyizing the documents");
        }
    }
}
