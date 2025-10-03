package MethodsAndArrays.AdvanceArrayQuestion;

public class SumAndAverageIn2DArray {
    public static void main(String[] args) {
     
        System.out.println("Welcome in the Sum & Average in 2D Array");

        int[][] numArr = ArrayUtility.input2DArray();
         
        long sum = sum(numArr);
        long average = average(numArr);

        System.out.println("Your sum array  is  : " + sum);
        System.out.println("Your average array is : " + average);


    }
    public static long  sum(int[][] numArr){
        long  sum = 0;
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static long average(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }

        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return (long) (sum(numArr) / size); 
    }

}
