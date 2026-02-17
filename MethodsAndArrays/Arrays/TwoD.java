package MethodsAndArrays.Arrays;

public class TwoD {
    public static void main(String[] args) {
        
        // //printing 2D arrays
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // int i = 0;
        // while(i < arr.length){
        //     int j = 0;
        //     while(j<arr.length){
        //         System.out.print(arr[i][j] + " ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        //Printing 2d Array 

        int[][] arr = {{1,2,3}, {2,3,4}, {4,5,6}};

        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr.length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    }


