package ControlAndStatementAndMath.ChallengeLoops;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        
        // Print even Number Only 
        System.out.println("Welcome in the Print only Even Number ");

        // System.out.print("Enter Your Number : ");
        // int num = input.nextInt();

        // for(int i = 0; i< 100; i++){
        //     if(i % 2 == 1){
        
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Your Even Numers are : " +i);

        // for(int i = 0; i<100; i++){
        //     if(i %2 == 0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //Print Only Even Numbers 
                                        
        for(int i= 0; i< 100; i++){
            if(i % 2 == 0){
                continue; 
            }
            System.out.println(i);
        }
    }

}
