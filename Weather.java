// Weather-Based Outfit Advisor
// Inputs: Temperature, weather condition ("Sunny", "Rainy", "Snowy", "Cloudy")
// Switch for weather:
// Sunny → If temp > 30 → light clothes, else normal.
// Rainy → Raincoat + waterproof shoes.
// Snowy → Jacket + gloves.
// Cloudy → Light jacket.

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner weather=new Scanner(System.in);
        
        System.out.println("---Weather based Outfit Advisor---");

        System.out.print("Select the Weather condition (Sunny/Rainy/Snowy/Cloudy) :");
        String condition=weather.next();

        switch (condition) {
            case "Sunny":
            System.out.print("Enter the temperature (+ve) :");
            int temp=weather.nextInt();

            if(temp>30){
                System.out.println("You should wear light clothes");
            }else{
                System.out.println("You should wear normal clothes");
            }
                break;

            case "Rainy":
            System.out.println("You should wear raincoat + waterproof shoes");
                break;

            case "Snowy":
            System.out.println("You should wear jacket + gloves");
                break;

            case "Cloudy":
            System.out.println("You should wear light jacket");
                break;
        
            default:
            System.out.println("Invalid weather condition");
                break;
        }
        weather.close();
    }

}
