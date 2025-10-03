package ControlAndStatementAndMath.ChallengeLoops;

import java.util.Scanner;

import MethodsAndArrays.AdvanceArrayQuestion.ArrayUtility;

public class occurrences {
  public static void main(String[] args) {
    // Occ Finder Program 
    Scanner input = new Scanner(System.in);

    int[] nums =  ArrayUtility.inputArray();
    System.out.println("Now , Enter the number you want to find : " );
    int element = input.nextInt();
    int occ = countOcc(nums, element);

    System.out.println("Your occ is : " + occ);

  }
  public static int countOcc(int[] nums, int element){
    int occ = 0;
    for(int num : nums){
        if(num == element){
            occ++;
        }
    }
    return occ;
  }

}
