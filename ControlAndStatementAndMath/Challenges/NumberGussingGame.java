package ControlAndStatementAndMath.Challenges;

import java.util.Scanner;

class NumberGussingGame {

    int random; 
    NumberGussingGame(){
        random = (int)Math.ceil(Math.random() * 100);
    }
    /**
     * 
     * @param guessNumber the number that player gussed 
     * @return Negative if the gussed number is smaller 
     * - 0 if the   gussed number is correct
     * -Positive if the gussed number is higher
     */
    int  guess(int guessNumber){
        return guessNumber -random;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Number Gussing Game  . Guess the Number betwwen 0 To 100");
        NumberGussingGame  game = new NumberGussingGame();
        int guess ;
        int result;
      
        do{
            System.out.print("Guess the Number : ");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("Congrates your Gussed is Correct");
            }else if(result < 0 ){
                System.out.println("Please guess Higher");
            }else{
                System.out.println("Please guess Lower");
            }

        }while(result != 0);

    }

}
