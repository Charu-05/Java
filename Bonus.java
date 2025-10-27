// Employee Bonus Allocation
// Inputs: Department ("IT", "HR", "Sales"), years of service, performance rating (1–5).
// Rules:
// IT → 10% bonus if years > 5 and rating ≥ 4.
// HR → 8% bonus if years > 3 and rating ≥ 3.
// Sales → 15% bonus if years > 2 and rating ≥ 4, else 5%.
// Switch for department, nested if for service & rating.

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner bonus=new Scanner(System.in);

        System.out.println("Bonus allocation");

        System.out.print("Enter Employee name: ");
        String name=bonus.next();

        System.out.print("Enter the Department (IT/HR/Sales) :");
        String department=bonus.next();

        System.out.print("Year of service :");
        int service=bonus.nextInt();

        System.out.print("Rating out of 5 :");
        int rating=bonus.nextInt();


        switch (department) {
            case "IT":
                System.err.print("Enter salary: ");
                int salary=bonus.nextInt();
            if(service>5 && rating>=4){
                System.out.println("10% bonus for IT employee");
                 
                int total=salary+(salary*10)/100;
                System.out.println("Total salary (Rs.)"+total+" for "+name);   
            }else{
                 System.out.println("Total salary (Rs.)"+salary+" for "+name);   
            }
                
                break;

            case "HR":
                System.err.print("Enter salary: ");
                int salaries=bonus.nextInt();
            if(service>3 && rating>=3){
                System.out.println("8% bonus for HR employee");
                 
                int total=salaries+(salaries*8)/100;
                System.out.println("Total salary (Rs.) "+total+" for "+name);   
            }else{
                 System.out.println("Total salary (Rs.) "+salaries+" for "+name);   
            }
                
                break;

            case "Sales":
                System.err.print("Enter salary: ");
                int salarie=bonus.nextInt();
            if(service>5 && rating>=4){
                System.out.println("15% bonus for Sales employee");
                 
                int total=salarie+(salarie*15)/100;
                System.out.println("Total salary (Rs.) "+total+" for "+name);   
            }else{
                 System.out.println("Total salary (Rs.) "+salarie+" for "+name);   
            }
                
                break;
        
            default:
            System.out.println("Invalid department");
                break;
        }
        bonus.close();
    }

}
