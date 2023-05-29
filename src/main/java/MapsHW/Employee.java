package MapsHW;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    //2)Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format
    //John Smith=$100000
    public static void main(String[] args) {


        Map<String, Double> employee = new LinkedHashMap<>();
        employee.put("Fatima",3452.6);
        employee.put("Adam",3456.5);
        employee.put("Rida",3457.8);
        employee.put("Said",10345.9);
        employee.put("Wiam",4567.9);

         String highestSalaryEm=" ";
        double highestSalary=0;

        for(Map.Entry<String,Double> entryE:employee.entrySet()){
            if(entryE.getValue()>highestSalary){
                highestSalary=entryE.getValue();

                highestSalaryEm=entryE.getKey();

            }
        }
        System.out.println("The highest employee salary is "+highestSalaryEm+" = "+highestSalary);
    }
}