package MethodsAndArrays.AdvanceArrayQuestion;

public class SunAndAverages {

     public static void main(String[] args) {
       
        System.out.println("Welcome to Array  Sum & Average ");
        int[] numArrry = ArrayUtility.inputArray();
        long sum = Sum(numArrry);
        long avg = average(numArrry);

        System.out.println("Your sum is : " + sum);
        System.out.println("Your average is : " + avg);
        
    }
    public static long Sum(int[] numArrry){
        long sum = 0;
        int i = 0;
        while(i < numArrry.length){
            sum = sum + numArrry[i];
            i++;
        }
        return sum;
    }
    public static long average(int[] numArrry){
     long sum  = Sum(numArrry);
        return  sum / numArrry.length;
    }

}
