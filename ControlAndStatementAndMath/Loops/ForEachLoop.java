package ControlAndStatementAndMath.Loops;

public class ForEachLoop {
    public static void main(String[] args) {
        
        String[] array = new String[]{
        "Navnnet", "Mohan", "Ram", "Shyam", "Rohan"

        };
        // PrintForEachLoop(array);
        PrintArraysInForLoop(array);
        
    }
    // public static void PrintForEachLoop(String[] array){
    //     for(String name : array){
    //         System.out.println(name);
    //     }

    public static void PrintArraysInForLoop(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    }


