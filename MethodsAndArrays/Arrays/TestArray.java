package MethodsAndArrays.Arrays;

public class TestArray {
    public static void main(String[] args) {

        // Test Arrays 
    
         
        // First Way 

        // int[] myArr =  new int[5];
        // myArr[0] = 90;
        // myArr[1] = 91;
        // myArr[2] = 92;
        // myArr[3] = 93;
        // myArr[4] = 94;

        //Second Way 

        int[] myArr = {90,91,92,93,94};

        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[2]);
        // System.out.println(myArr[3]);
        // System.out.println(myArr[4]);


        // Array Traversal 
        
        int index = 0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

    }
    }

