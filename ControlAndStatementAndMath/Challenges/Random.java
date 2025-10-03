package ControlAndStatementAndMath.Challenges;

public class Random {

    int roll(){
        double random = Math.random() * 10;
        int currRoll = (int)(Math.ceil(random));
        return currRoll;
    }
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i< 10; i++){
            System.out.println(random.roll());
        }
    }

}
