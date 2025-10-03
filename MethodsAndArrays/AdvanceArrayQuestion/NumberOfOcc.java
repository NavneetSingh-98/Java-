package MethodsAndArrays.AdvanceArrayQuestion;

import java.util.Scanner;

public class NumberOfOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the Array Occurrences ");
        // How Many time Number in come is List 
        int[] numArrry = ArrayUtility.inputArray();

        System.out.println("Now Enter The Number you want to find : ");
        int num = input.nextInt();

        int noOfOcc = noOfOcc(numArrry, num);
        System.out.println("Your element was found "+ noOfOcc  + "  Times in the array");
    

    }
    public static int noOfOcc(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] == num){
                occ++;

            }
            i++;
        }
        return occ;
    }

}
