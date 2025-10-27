// Online Exam Authentication
// Inputs: Login time, face scan status (pass/fail), internet speed.
// Rules:
// If login time is before exam start:
// If face scan passed and speed > 1 Mbps → Allow.
// Else → Reject.
// If login is after start time:
// Allow only if < 10 min late and face scan passed.

import java.util.Scanner;


public class Online_exam {
    public static void main(String[] args) {
        Scanner exam = new Scanner(System.in);

        System.out.println("=== Online Exam Login ===");
        System.out.print("Enter your name: ");
        String name = exam.next();
        System.out.println("Candidate name:"+name);

        System.out.print("Enter login time (in minutes after exam start, negative if early): ");
        int loginTime = exam.nextInt();

        System.out.print("Enter face scan status (pass/fail): ");
        String faceScan = exam.next().toLowerCase();

        


        if (loginTime < 0 ) { 
            if (faceScan.equals("pass") ) {
                System.out.print("Enter internet speed (in Mbps): ");
                double speed = exam.nextDouble();
                if(speed>1){
                   System.out.println("Access Granted (Early login accepted)");
                }    
            } else {
                System.out.println("Access Denied");
            }
        } else {
            if (loginTime <= 10 && faceScan.equals("pass")) {
                System.out.println("Access Granted (Late but allowed within 10 minutes)");
            } else {
                System.out.println("Access Denied (Late or face scan failed)");
            }
        }

        exam.close();
    }
}
