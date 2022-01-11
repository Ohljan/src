package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
    int hourlyRate=48,
        weeklyHours=40;
       double stateTaxRate=9.1,
              federalTaxRate=4.9;
       int salaryBeforeTax=hourlyRate*weeklyHours*52;
       double stateTax=salaryBeforeTax*stateTaxRate/100;
       double federalTax=salaryBeforeTax*federalTaxRate/100;
       double totalTax=stateTax+federalTax;
       double sararyAfterTax= salaryBeforeTax-totalTax;

        System.out.println("gros pay is = $ "+salaryBeforeTax);
        System.out.println(" state tax is = $"+stateTax);
        System.out.println("federal tax is = $ "+federalTax);
        System.out.println("total tax is = $"+totalTax);
        System.out.println("net income is = $"+sararyAfterTax);
















    }













}
