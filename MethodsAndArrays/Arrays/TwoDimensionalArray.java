package MethodsAndArrays.Arrays;

public class TwoDimensionalArray {
    // public static void main(String[] args) {
        
    //     int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    //     // System.out.println(arr[0].length);  //Lenght oF the Array 


    //      //Traversal
    //     int i =0;
    //     while(i <arr.length){
    //         int j= 0;
    //         while(j <arr[i].length){
    //             System.out.print(arr[i][j] + " ");
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        //Traversal Array 
        int i = 0;   //Condition 
        while(i <arr.length){   // Intilization 
            int j = 0;
            while(j<arr.length){
                System.out.println(arr[i][j] + " "); //Printing 
                j++;
            }System.out.println(); 
            i++;
        }
    }

}
