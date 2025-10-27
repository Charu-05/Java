// Advanced Electricity Bill Calculator
// Inputs: Units consumed, connection type ("Domestic", "Commercial").
// Domestic: 0–100 units → ₹3/unit and 101–300 → ₹4/unit and 300 → ₹5/unit
// Commercial:0–200 units → ₹5/unit and 201–500 → ₹6/unit and 500 → ₹8/unit
// Use nested if for slab calculation and switch for connection type.

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner electricity=new Scanner(System.in);
        
        System.out.print("Enter the name :");
        String name=electricity.next();
        System.out.println("Name of the customer: "+name);

        System.out.print("Select Connection type (Domestic,Commercial) :");
        String type=electricity.next();

        switch (type) {
            case "Domestic":
              System.out.print("Enter the units: ");
              int units=electricity.nextInt();
              if(units>0 && units<=100){
                System.out.println("Rs.3/unit");
                int unit=units*3;
                System.err.println("Electricity bill: "+unit);
              }
              if(units>100 && units<=300){
                System.out.println("Rs.4/unit");
                int unit=units*4;
                System.err.println("Electricity bill: "+unit);
              }
              if(units>300){
                System.out.println("Rs.5/unit");
                int unit=units*5;
                System.err.println("Electricity bill: "+unit);
              }
                break;

            case "Commercial":
              System.out.print("Enter the units: ");
              int unit=electricity.nextInt();
              if(unit>0 && unit<=200){
                System.out.println("Rs.5/unit");
                int bill=unit*5;
                System.err.println("Electricity bill: "+bill);
              }
              if(unit>200 && unit<=500){
                System.out.println("Rs.6/unit");
                int bill=unit*6;
                System.err.println("Electricity bill: "+bill);
              }
              if(unit>500){
                System.out.println("Rs.8/unit");
                int bill=unit*8;
                System.err.println("Electricity bill: "+bill);
              }
                
                break;
        
            default:
            System.out.println("Invalid type");
                break;
        }
        electricity.close();

    }

}
