// Cinema Ticket Price Calculation
// Inputs: Movie type ("2D", "3D", "IMAX"), time of day ("Morning", "Evening", "Night"), age.
// Rules:
// Kids (<12) → 50% discount
// Seniors (>60) → 30% discount
// Evening shows have +₹50 surcharge.
// Switch for movie type base price, nested if for age/time adjustments.

import java.util.Scanner;
   

public class Cinema {
    public static void main(String[] args) {
        Scanner cinema = new Scanner(System.in);

        System.out.println("--Ticket booking--");

        System.out.print("Enter movie type (2D / 3D / IMAX): ");
        String movie = cinema.next();

        System.out.print("Enter time of day (Morning / Evening / Night): ");
        String time = cinema.next();

        double Price = 0;

        switch (movie.toUpperCase()) {
            case "2D":
                Price = 150;
                break;
            case "3D":
                Price = 250;
                break;
            case "IMAX":
                Price = 400;
                break;
            default:
                System.out.println("Invalid movie type!");
                break;
        }

        if (time.equalsIgnoreCase("Evening")) {
            Price += 50;
        }

        System.out.print("Enter number of persons: ");
        int persons = cinema.nextInt();

        double total = 0;

        for (int i = 1; i <= persons; i++) {
            System.out.print("Enter age of person " + i + ": ");
            int age = cinema.nextInt();

            double price = Price;

            if (age < 12) {
                price *= 0.5;
                System.out.println("Person " + i + ": Child Ticket (Rs.)" + price);
            } else if (age > 60) {
                price *= 0.7; 
                System.out.println("Person " + i + ": Senior Ticket (Rs.)" + price);
            } else {
                System.out.println("Person " + i + ": Adult Ticket (Rs.)" + price);
            }

            total += price;
        }

        System.out.println("----- Ticket Summary -----");
        System.out.println("Movie Type: " + movie);
        System.out.println("Time of Day: " + time);
        System.out.println("Total Amount for " + persons + " Persons: ₹" + total);

        cinema.close();
    }
}


