package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;


public class MultiCatchBlocks {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            System.out.println(employee.getSalary());// null pointer exception
        }catch (NullPointerException e){
            System.out.println("First catch block");
            e.printStackTrace();}
        catch (IndexOutOfBoundsException e) {
            System.out.println("Second Catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }
        System.out.println("Tested Completed");
    }
}