// 1. University Admission Eligibility Checker
// Inputs: 12th grade marks, entrance exam score, stream ("Science", "Commerce", "Arts").
// Rules:
// Science → Min 75% in 12th and 80% in entrance.
// Commerce → Min 65% in 12th and 70% in entrance.
// Arts → Min 50% in 12th or 60% in entrance.
// Nested inside each stream check:
// If student has sports quota, reduce marks requirement by 5%.

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner eligibility=new Scanner(System.in);

        System.out.println("Eligibility checking");
        System.out.println("---------------------");

        System.out.print("Enter student name :");
        String name=eligibility.next();
        System.out.println("Student name: "+name);

        System.out.print("Enter 12th grade :");
        double grade=eligibility.nextDouble();
        System.out.println("Student 12th grade: "+grade+"%");

        System.out.println("Enter entrance exam score :");
        double entrance_score=eligibility.nextDouble();
        System.out.println("Student entrance exam score :"+entrance_score);

        System.out.println("Please choose the stream (Science or Commerce or Arts)");
        String stream=eligibility.next();
        System.out.println("Student choosen stream :"+stream);

        System.out.print("Do you have sportsquota? (Yes or No) :");
        String quota=eligibility.next();
        System.out.println("Student had sports quota :"+quota);

        System.out.println("-----------------------------------");

       if(stream.equalsIgnoreCase("Science")){
        double min12th=75;
        double minentrance=80;

        if(quota.equalsIgnoreCase("Yes")){
            min12th-=5;
            minentrance-=5;
            System.out.println("Min 12th marks :"+min12th);
            System.out.println("Min Entrance marks :"+minentrance);
        }
          if(grade>=min12th && entrance_score>=minentrance){
            System.out.println("Student "+name +" eligible for Science stream");  
          }else{
             System.out.println("Student "+name +" not-eligible for Science stream");  
          }   
       }

       if(stream.equalsIgnoreCase("Commerce")){
        double min12th=65;
        double minentrance=70;

        if(quota.equalsIgnoreCase("Yes")){
            min12th-=5;
            minentrance-=5;
            System.out.println("After reduced 12th marks :"+min12th);
            System.out.println("After reduced Entrance marks :"+minentrance);
        }
          if(grade>=min12th && entrance_score>=minentrance){
            System.out.println("Student "+name +" eligible for Commerce stream");  
          }else{
             System.out.println("Student "+name +" not-eligible for Commerce stream");  
          }   
       }

       if(stream.equalsIgnoreCase("Arts")){
        double min12th=50;
        double minentrance=60;

        if(quota.equalsIgnoreCase("Yes") ){
            min12th-=5;
            minentrance-=5;
            System.out.println("After reduced 12th marks :"+min12th);
            System.out.println("After reduced Entrance marks :"+minentrance);
        }
          if(grade>=min12th && entrance_score>=minentrance){
            System.out.println("Student "+name +" eligible for Arts stream");  
          }else{
             System.out.println("Student "+name +" not-eligible for Arts stream");  
          }   
       }
        eligibility.close();
    }
}
