// Hospital Bed Allocation
// Inputs: Patient condition ("Critical", "Serious", "Stable"), age, insurance type ("Premium", "Basic", "None").
// Rules:
// Critical → ICU (if age > 60, priority bed).
// Serious → Special Ward (if insurance is Premium, private room).
// Stable → General Ward (if Basic insurance, semi-private room).
// Nested inside condition checks.

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner hsptl = new Scanner(System.in);

        System.out.println("Bed allocation");

        System.out.print("Enter patient name :");
        String name=hsptl.next();
        System.out.println("Patient name: "+name);

        System.out.print("Enter patient age :");
        int age=hsptl.nextInt();

        System.out.print("Choose patient condition (Critical,Serious,Stable) :");
        String condition=hsptl.next();

        System.out.print("Choose insurance type (Premium, Basic, None) :");
        String insurance=hsptl.next();

        System.out.println("------------------------------------------");
    
        if(condition.equalsIgnoreCase("Critical")){
            if(age>60){
                System.out.println("Arrange priority bed in ICU for patient "+name);
            }else{
                System.out.println("Admitted in ICU for patient "+name);
            }
        }

        else if(condition.equalsIgnoreCase("Serious")){
            if(insurance.equals("Premium")){
                System.out.println("Admitted in Special ward for patient "+name+" with private room");
            }
            else if (insurance.equals("Basic")){
                System.out.println("Admitted in Special ward for patient "+name+" with semi-private room");
            }
            else{
                System.out.println("Admitted in Special ward for patient "+name+" with normal room");
            }

        }

        else{
           if(insurance.equals("Premium")){
                System.out.println("Admitted in General ward for patient "+name+" with private room");
            }
            else if (insurance.equals("Basic")){
                System.out.println("Admitted in General ward for patient "+name+" with semi-private room");
            }
            else{
                System.out.println("Admitted in General ward for patient "+name+" with normal room");
            }  
        }
        hsptl.close();
    }

}
