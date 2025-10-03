package MethodsAndArrays.AdvanceArrayQuestion;

public class MergeTwoArray {
    public static void main(String[] args) {
        
        // Merge Two sorted Arrays 
        System.out.println("Welcome in the Two Merge Sorted Array");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        int[] mergedArr = merger(arr1, arr2);
        System.out.println("your merged Array is : ");
        ArrayUtility.displayArray(mergedArr);

    }
    public static int[] merger(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k =0;  // Merger 

        while(i < arr1.length || j < arr2.length){
            if( j == arr2.length || 
            ( i< arr1.length &&  arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
        

    }

}
