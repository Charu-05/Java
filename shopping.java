// Task 3: E-Commerce Discount & Shipping Calculator
// Description:
// Write a program that:
// Takes purchase amount and user type ("Prime" or "Regular").
// If purchase amount > ₹5000:
// Prime users get 20% discount.
// Regular users get 10% discount.
// If purchase amount is between ₹2000 and ₹5000:
// Prime users get 10% discount + free shipping.
// Regular users get 5% discount, shipping ₹100 extra.
// If purchase amount < ₹2000:
// Prime users → no discount but free shipping.Regular users → no discount and ₹150 shipping.
// Use if-elseif-nested if to decide discount and shipping.

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner shop=new Scanner(System.in);

        System.out.print("Enter name : ");
        String name=shop.next();
        System.out.println("Customer Name: "+name);

        System.out.print("Enter purchase amount (Rs): ");
        int amount=shop.nextInt();
        System.out.println("Purchase amount (Rs.) "+amount);

        System.out.print("Enter user type=> (Prime or Regular) :");
        String user=shop.next();
        System.out.println("User Type: "+user);

        System.out.println("----------------------------------------");

        if(amount>5000){
            if(user.equalsIgnoreCase("Prime")){
                System.out.println("Prime users get 20% discount");
                int discount=(amount*20)/100;
                System.out.println("Discount (Rs): "+discount);
                int total=amount-discount;
                System.out.println("Total price (Rs): "+total);
            }else{
                System.out.println("Regular users get 10% discount");
                int discount=(amount*10)/100;
                System.out.println("Discount (Rs): "+discount);
                int total=amount-discount;
                System.out.println("Total price (Rs): "+total);
            }
        }
        
        else if(amount<=5000 && amount>2000){
            if(user.equalsIgnoreCase("Prime")){
                System.out.println("Prime users get 10% discount + free shipping");
                int discount=(amount*10)/100;
                System.out.println("Discount (Rs): "+discount);
                int total=amount-discount;
                System.out.println("Total price (Rs): "+total);
            }else{
                System.out.println("Regular users get 5% discount + shipping Rs.100 extra");
                int discount=(amount*5)/100;
                System.out.println("Discount (Rs): "+discount);
                int total=amount-discount+100;
                System.out.println("Total price (Rs): "+total);
            }
        }

        else{
            if(user.equalsIgnoreCase("Prime")){
                System.out.println("Prime users => no discount but free shipping");
                int total=amount;
                System.out.println("Total price (Rs): "+total);
            }else{
                System.out.println("Regular users => no discount and ₹150 shipping.");
                int total=amount+150;
                System.out.println("Total price (Rs): "+total);
            }
        }
        shop.close();
    }
}
