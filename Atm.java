// ATM Cash Withdrawal Simulation
// Inputs: Account type ("Savings", "Current"), balance, withdrawal amount, day of the week.
// Rules:
// Savings: Min balance after withdrawal should be ₹1,000.
// Current: Min balance after withdrawal should be ₹5,000.
// On Sunday, ATM service charge is ₹50 extra.
// Use nested if for account + day check.

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner atm=new Scanner(System.in);

        
        System.out.print("Choose Account Type => (Savings or Current)");
        String account = atm.next();

        double balance=50000;
        System.out.println("Your account has balance: Rs."+balance);

        System.out.print("Enter the withdrawal amount: ");
        int withdrawal=atm.nextInt();

        System.out.print("Enter day of the week: ");
        String day=atm.next();

        System.out.println("------------------------------------");
        
        int serviceCharge=50;
        
        if (day.equalsIgnoreCase("Sunday")) {
            serviceCharge = 50;
            System.out.println("Note=> Rs.50 Sunday service charge applied.");
        }

        if(account.equalsIgnoreCase("Savings")){
           double minbalance=1000;
           double debit=balance-withdrawal-serviceCharge;

           if(debit>=minbalance){
            double amt=withdrawal+serviceCharge;
            System.out.println("Debited amount from the account Rs."+amt);
            System.out.println("Remaining balance from the account Rs."+debit);
           }
           else{
            double amt=balance-withdrawal-serviceCharge;
            System.out.println("Your account have minimum balance only! Rs."+amt);
           }
        }

        else if(account.equalsIgnoreCase("Current")){
           double minbalance=5000;
           double debit=balance-withdrawal-serviceCharge;

           if(debit>=minbalance){
            double amt=withdrawal+serviceCharge;
            System.out.println("Debited amount from the account Rs."+amt);
            System.out.println("Remaining balance from the account Rs."+debit);
           }
           else{
            double amt=balance-withdrawal-serviceCharge;
            System.out.println("Your account have minimum balance only! Rs."+amt);
           }
        }

        else{
            System.out.println("Invalid account type! Please enter valid type");
        }
        atm.close();
        
    }

}
