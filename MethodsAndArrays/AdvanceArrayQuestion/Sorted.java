package MethodsAndArrays.AdvanceArrayQuestion;

public class Sorted {
    public static void main(String[] args) {
        System.out.println("Welcome in the Checking sorted Array ");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if(isInc || isDec){
            System.out.println("Your Array is Sorted ");
        }else{
            System.out.println("Your Array is Not Sorted ");
        }

    }
    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i -1]){
                return false;
            }
            i++;
        }
        return true;

    }
    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
}

}
