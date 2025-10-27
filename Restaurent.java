// Restaurant Billing with Membership
// Inputs: Bill amount, membership type ("Gold", "Silver", "None"), day of week.
// Gold → 20% discount, Silver → 10% discount.
// On weekends, Gold gets free dessert, Silver gets 5% extra discount.
// Use nested if + switch for membership.

import java.util.Scanner;

public class Restaurent {
    public static void main(String[] args) {
       Scanner billing=new Scanner(System.in);

       System.out.print("--Restaurant bill--");
       
       System.out.print("Enter number of idli :");
       int idly=billing.nextInt();
       int p1=idly*10;
       System.out.println("Total idly set price: "+p1);

       System.out.print("Enter number of dosa :");
       int dosa=billing.nextInt();
       int p2=dosa*20;
       System.out.println("Total dosa set price: "+p2);

       System.out.print("Enter number of poori :");
       int poori=billing.nextInt();
       int p3=poori*25;
       System.out.println("Total poori set price: "+p3);

       System.out.print("Enter number of set of pongal:");
       int pongal=billing.nextInt();
       int p4=pongal*10;
       System.out.println("Total pongal set price: "+p4);

       int total=p1+p2+p3+p4;
       System.out.println("Total bill amount: "+total);

       
       System.out.println("Enter membership type (Gold/Silver/None)");
       String membership=billing.next();

       System.out.println("Enter week of the day:");
       String day=billing.next();


       switch (membership) {
        case "Gold":
        int bill=(total*20)/100;

        if(day.equalsIgnoreCase("Sunday")){
            System.out.println("Gold gets free desert");
            System.out.println("Total bill = Rs."+bill+" + Free desert");
        }else{
            System.out.println("Total bill = Rs."+bill);
        }
            
            break;

        case "Silver":
        int bill2=(total*10)/100;

        if(day.equalsIgnoreCase("Sunday")){
            System.out.println("Silver gets extra 5% offer");
            int bills=(bill2*5)/100;
            System.out.println("Total bill = Rs."+bills);
        }else{
            System.out.println("Total bill = Rs."+bill2);
        }
             break;

        case "None":
          int bill3=total;
          System.out.println(" Total bill :"+bill3);
            break;
       
        default:
          System.out.println("Invalid error");
            break;
       }
    billing.close();
       
    }

}
