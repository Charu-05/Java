// Task 1: Exam Result Grading System with Bonus Marks
// Description:
// Write a program that:
// Takes total marks and attendance percentage as input.
// If marks ≥ 90 → Grade A, 80–89 → Grade B, 70–79 → Grade C, else Fail.
// If attendance is above 95%, give 5 bonus marks before grading.
// If marks are less than 35 even after bonus → print "Fail – Needs Improvement".
// Use nested if to first check attendance, then grading.

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner mark=new Scanner(System.in);

        System.out.print("Enter Student Name:");
        String Name=mark.next();
        System.out.println("Student-name: "+Name);

        System.out.print("Enter roll number:");
        int roll=mark.nextInt();
        System.out.println("Roll no: "+roll);
       
        System.out.print("Tamil subject:");
        int Tamil= mark.nextInt();

        System.out.print("English subject:");
        int English= mark.nextInt();

        System.out.print("Maths subject:");
        int Maths= mark.nextInt();

        System.out.print("Science  subject:");
        int Science= mark.nextInt();

        System.out.print("Social subject:");
        int Social= mark.nextInt();

        System.out.print(" Enter Attendance percentage (%): ");
        int attendance=mark.nextInt();

        System.out.println("_______________________________________");

        int Total=Tamil+English+Maths+Science+Social;
        System.out.println("Total-marks :" +Total);

        int average=Total/5;
        System.out.println("Average :" +average);

        if (attendance>95){
           average+=5;
           System.out.println("Bonus 5 marks for attendance performance");
           System.out.println("After bonus total_marks:"+average);
        }else{
            System.out.println("No bonus marks");
            System.out.println("Total_marks:"+average);

        }
       
        if(average>=90){
            System.out.println("Grade: A");
        }else if(average<90 && average>=80){
            System.out.println("Grade: B");
        }else if(average<80 && average>=70){
            System.out.println("Grade: C");
        }else if(average<70 && average>35){
            System.out.println("Grade: D");
        }else{
             System.out.println("Fail!");
             System.out.println("Needs Improvement");
        }
        mark.close();
          
    };
    };


