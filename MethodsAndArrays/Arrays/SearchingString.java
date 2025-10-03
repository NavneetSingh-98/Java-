package MethodsAndArrays.Arrays;

import java.util.Scanner;

public class SearchingString {
    public static void main(String[] args) {
        //Searching String in Arrys 

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome in the String Searching in Array ");
    String[] myArr = {"Navneet","Shivam","Mohan","Rohan","Geeta","Rita","Ohm","Nana","Gudiya","Vishal"};

    System.out.print("Enter Your Element You want to Search : ");
    String newStrArr = input.next();
    boolean isFound = isFound(myArr, newStrArr); 
    if(isFound){
        System.out.println("Your String is Found ");
    }else{
        System.out.println("Your String is Not Found ");
    }
  
     // Methods  and Functions 

     
    }
    public static boolean isFound(String[] myArr,String newStrArr){
        int index = 0;
        while (index < newStrArr.length()) {

            if(myArr[index] == newStrArr ){
                return true;
            }
            index++;
            
        }

        return false;
    }

}
