package ControlAndStatementAndMath.Challenges;

public class randomNumber {

    int roll(){
        double random = Math.random() * 10 ;
        int currRoll = (int)Math.ceil(random);
        return currRoll;
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        for(int i = 0; i<5; i++){
        System.out.println(dice.roll());
        }
    }

}
