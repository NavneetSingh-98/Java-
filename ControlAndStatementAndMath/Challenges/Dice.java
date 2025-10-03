package ControlAndStatementAndMath.Challenges;

 class Dice {
    
        
    // int  roll(){
    //     double random = Math.random() * 6;
    //     int currRoll =(int)(Math.ceil(random));
    //     return currRoll;
    // }
    // public static void main(String[] args) {
    //     // Dice randome simulate 
    //     Dice dice = new Dice();
    //     for(int i = 0 ; i < 10; i++){
    //         System.out.println(dice.roll());
            
            
        

    //     }
      
    int roll(){
        double random = Math.random() * 6;
        int currRoll = (int)(Math.ceil(random));
        return currRoll;
    }
    public static void main (String[] args){
        
        // Dice random simulate 
        Dice dice = new Dice();
        for(int i = 0 ; i<10; i++){
            System.out.println(dice.roll());
        }
    }
        
    }
    


