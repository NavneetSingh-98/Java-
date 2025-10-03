package MethodsAndArrays.AdvanceArrayQuestion;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);

            System.out.print("Please enter the number of element : ");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while(i < size){
            System.out.print("Please enter Element number  " + (i+1) + " : ");
            nums[i]  = input.nextInt();
            i++;

        }
        return nums;
      
    }
       public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of Rows1 : ");
        int rows = input.nextInt();
        System.out.print("Please enter The number of Coloumn : ");
        int coloumn = input.nextInt();
        int[][] numArray = new int[rows][coloumn];

        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < coloumn){
                System.out.print("Please enter row : " +(i+1) +  ", coloum : " + (j +1)+ " : ");
                numArray[i][j]  = input.nextInt();
              
                j++;
            }
              i++;
            

        }
        return numArray;
      
    }
    // Display an Array 
    public static void displayArray(int[] numArr){
        int i = 0;
        while(i < numArr.length){
            System.out.println(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }

}
