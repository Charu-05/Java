// Task 2: Loan Eligibility Checker (Nested If)
// Description:
// Write a program to decide if a person can get a loan:
// Ask for age, monthly income, and CIBIL score.
// If age is between 21 and 60:
// If income ≥ ₹30,000:
// If CIBIL score ≥ 750 → "Loan Approved"
// Else → "Loan Rejected -Low CIBIL"
// Else → "Loan Rejected -Low Income"
// Else → "Loan Rejected -Age Not Eligible"

import java.util.Scanner;

public class loan_example {
  public static void main(String[] args) {
    Scanner loan=new Scanner(System.in);

    System.out.print("Enter Applicant name :");
    String name=loan.next();
    System.out.println("Applicant name :"+name); 

    System.out.print("Enter age :");
    int age=loan.nextInt();
    System.out.println("Applicant Age :"+age);

    System.out.print("Enter monthly income (Rs.) :");
    double income=loan.nextDouble();
    System.out.println("Apllicant income :"+income);

    System.out.print("Enter CIBIL score :");
    int cibil=loan.nextInt();
    System.out.println("Applicant cibil score ="+cibil);

    if(age>30 && age<60){

        if(income>=50000){

            if(cibil<750){
                System.out.println("Loan approved! for " +name);
            }
            else{
                System.out.println("Loan Rejected => Low CIBIL score for "+name);
            }
        }
        else{
            System.out.println("Loan Rejected => Low income for "+name);
            }
        }
    else{ 
        System.out.println("Loan Rejected => Age not eligible! for "+name);
   }
   loan.close();
                
    }          
    }
