package MethodsAndArrays.AdvanceArrayQuestion;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        // Delete a Specific Array 
        System.out.println("Welcome in the Array Deletion ");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now , Enter the element you want to Delete ");
        int numToDelete = input.nextInt();
        int[] newArr = numberDelete(numArr, numToDelete);
        System.out.println("Here is your Array ");
        ArrayUtility.displayArray(numArr);
    }
    public static int[] numberDelete(int[] numArr, int numToDelete){
        int occ = NumberOfOcc.noOfOcc(numArr, numToDelete);

        if(occ ==0 ){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0 , j= 0;
        while(i < numArr.length){
            if(numArr[i] != numToDelete){
                numArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return numArr;

    }

}
