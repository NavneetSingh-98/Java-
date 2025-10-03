package MethodsAndArrays.AdvanceArrayQuestion;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Welcome to the Max & Min");
        int[] numArrry = ArrayUtility.inputArray();

        int max = Max(numArrry);
        int min = Min(numArrry);
        System.out.println("Your Max is : " + max);
        System.out.println("Your Min is : " + min);

    }
    public static int Max(int[] numArr){
        if(numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while(i< numArr.length){
            if(max < numArr[i]){
                max = numArr[i];

            }
            i++;
        }
        return max;
    }
    public static int Min(int[] numArr){
        int min = Integer.MAX_VALUE;

        int i = 0;
        while(i < numArr.length){
            if(min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;

    }

}
