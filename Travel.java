// Travel Fare Calculator (Switch + Nested If)
// Inputs: Transport mode ("Bus", "Train", "Flight"), distance, seat class.
// Rules:
// Bus:
// <100 km → ₹5/km
// ≥100 km → ₹4/km
// Train:
// General → ₹2/km
// Sleeper → ₹3/km
// AC → ₹5/km
// Flight:
// Economy → ₹8/km
// Business → ₹15/km
// Use switch for transport mode and nested if for pricing.

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner transport=new Scanner(System.in);
        System.out.print("Enter the mode of transport (Bus,Train,Flight) :");
        String vehicle=transport.next();

        switch (vehicle) {
            case "Bus":
            System.out.print("Enter the distance (km):");
            int distance=transport.nextInt();
             if(distance<100){
                System.out.println("Rs.5/km for distance less than 100km");
                distance=distance*5;
                System.out.println("Fare for travel(Rs.): "+distance);
             }else{
                System.out.println("Rs.4/km for distance less than 100km");
                distance=distance*4;
                System.out.println("Fare for travel(Rs.): "+distance);
             }
            break;

            case "Train":
            System.out.print("Select the type (General/Sleeper/AC) :");
            String type=transport.next();
             if(type.equalsIgnoreCase("General")){
                System.out.print("Enter the distance (km):");
                int dis=transport.nextInt();
                System.out.println("Rs.2/km for general");
                int total=dis*2;
                System.out.println("Fare for travel(Rs.): "+total);
             }else if(type.equalsIgnoreCase("Sleeper")){
                System.out.print("Enter the distance (km):");
                int dis=transport.nextInt();
                System.out.println("Rs.3/km for sleeper");
                int total=dis*3;
                System.out.println("Fare for travel(Rs.): "+total);
             }else{
                System.out.print("Enter the distance (km):");
                int dis=transport.nextInt();
                System.out.println("Rs.5/km for sleeper");
                int total=dis*5;
                System.out.println("Fare for travel(Rs.): "+total);
             }
            break;

            case "Flight":
            System.out.print("Select the type (Economy/Bussiness) :");
            String use=transport.next();
             if(use.equalsIgnoreCase("Economy")){
                System.out.print("Enter the distance (km):");
                int dis=transport.nextInt();
                System.out.println("Rs.8/km for economy");
                int total=dis*8;
                System.out.println("Fare for travel(Rs.): "+total);
             }else{
                System.out.print("Enter the distance (km):");
                int dis=transport.nextInt();
                System.out.println("Rs.15/km for sleeper");
                int total=dis*15;
                System.out.println("Fare for travel(Rs.): "+total);
             }
            break;

            default:
            System.out.println("Invalid mode");
                break;
        }
        transport.close();
    }
}

