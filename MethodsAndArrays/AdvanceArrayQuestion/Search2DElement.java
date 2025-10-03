package MethodsAndArrays.AdvanceArrayQuestion;

import java.util.Scanner;

public class Search2DElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Search Element in 2D Array 
        
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Now , Enter you want to search ");

        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if(isFound){
            System.out.println("Your number was found");
        }else{
            System.out.println("Your number was not found");
        }

    }
    public static boolean search(int[][] numArr , int num){
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr.length){
                if(numArr[i][j] == num){
                    return true;

                }
                j++;

            }
            i++;
        }
        return false;

    }

}
