package MethodsAndArrays.AdvanceArrayQuestion;

public class Palindrome {
    public static void main(String[] args) {
        // Check Palindrome Or Not 
        System.out.println("Welcome in the Checking Plaindrome or Not");
        int[] numArr = ArrayUtility.inputArray();
        boolean Palindrome =  IsPalindrome(numArr);
        if(Palindrome){
            System.out.println("Your Array is Palindrome ");
        }else{
            System.out.println("Your Array in Not Palindrome ");
        }

    }
    //Method
    public static boolean IsPalindrome(int[] numArr){
        int i = 0;
        while(i < numArr.length/2){
            if(numArr[i] != numArr[numArr.length -1 -i]){
                return false;
            }
            i++;   //increment 
        }
        return true ;  

    }

}
