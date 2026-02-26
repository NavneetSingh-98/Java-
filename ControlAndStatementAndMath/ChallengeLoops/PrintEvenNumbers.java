package ControlAndStatementAndMath.ChallengeLoops;

public class PrintEvenNumbers {
    public static void main(String[] args) {
    
        
        // Print even Number Only 
        System.out.println("Welcome in the Print only Even Number ");


        //Print Only Even Numbers 
                                        
        // for(int i= 0; i< 100; i++){
        //     if(i % 2 == 0){
        //         continue; 
        //     }
        //     System.out.println(i);
        // }

        for(int i = 0; i<100; i++){
            if(i%2 ==0){
                continue;
            }
            System.out.println(i);
        }
    }

}
