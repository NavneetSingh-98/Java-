package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        // Read Input from the user 

        Scanner input = new Scanner(System.in);

        // while(true){
        //     System.out.print("Enter Your String : ");
        //     String command = input.next();

        //     if(command.equals("exit")){
        //         break;
        //     }
        // }
        // System.out.println("You exit succesfully.. ");
        // while (true) {
        //     System.out.print("Enter your string : ");
        //     String command = input.next();

        //     if(command.equals("exit")){
        //         break;
        //     }
        //     System.out.println("You exit succesfully..");
            
        // }

        // while(true){
        //     System.out.print("Enter Your String : ");
        //     String commend = input.next();

        //     if(commend.equals("exit")){
        //         break;
                
        //     }
        //     System.out.println("You succesfully Exited");
        // }

        while(true){
            System.out.println("Enter Your String ");
            String commend = input.next();
            if(commend.equals("exit")){
                break;
            }
            System.out.println("You exit succesfully");
        }
}
}
