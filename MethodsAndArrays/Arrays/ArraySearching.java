package MethodsAndArrays.Arrays;

import java.util.Scanner;

public class ArraySearching {
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     int[] myArr = {2,3,4,5,56,43,23,1,34,45};
    //     System.out.println("Welcome to Searching Array ");

    //     System.out.print("Enter The Array you want to search : ");
    //     int num = input.nextInt();

    //     boolean isFound = isFound(myArr, num);

    //     if(isFound){
    //         System.out.println("Your Number is Found ");
    //     }else{
    //         System.out.println("Your Number is not Found ");
    //     }
    // }
    // public static boolean isFound(int[] myArr , int num){
    //     int index = 0;
    //     while(index < myArr.length){
    //         if(myArr[index] == num){
    //             return true;
    //         }
    //         index++;

    //     }
    //     return false;
    // }

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     int[] myArr = {2,3,4,5,6,7,8,9,12,34,56,64};

    //     System.out.println("Enter Your Number You want Find : ");
    //     int num = input.nextInt();
    //     boolean isFound = isFound(myArr, num);


    //     if(isFound){
    //         System.out.println("Your Number is Found ");
    //     }else{
    //         System.out.println("Your Number not found ");
    //     }


    // }
    // public static boolean isFound(int[] myArr, int num){
    //     int index = 0;
    //     while(index < myArr.length){
    //         if(myArr[index] == num){
    //             return true;
    //         }
    //         index++;
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome in the Array Seaching ");

    //     int[] myArr = {1,2,3,4,5,77,87,43,23,12,334,3432,54};
    //     System.out.print("Enter Your Number You want to Search : ");
    //     int num = input.nextInt();
    //     boolean isFound = isFound(myArr, num);

    //     if(isFound){
    //         System.out.println("Your Number Is Found ");
    //     }else{
    //         System.out.println("Your Number Is Not Found ");
    //     }

    // }
    // public static boolean isFound(int[] myArr, int num){
    //     int index  =0;
    //     while(index < myArr.length){
    //         if(myArr[index] == num){
    //             return true; 
    //         }
    //         index++;
    //     }
    //     return false;
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  Array Number  ");
        int num = input.nextInt();

        int[] myArr = {1,2,3,4,5,7};
        boolean isFound = isFound(myArr, num);
        if(isFound){
            System.out.println("Your Number is Found ");
        }else{
            System.out.println("Your Numbber is Not Found ");
        }


    }
    public static boolean isFound(int[] myArr, int num){
        int index = 0;
        while(index <  myArr.length){
            if(myArr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }

}
