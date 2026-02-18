package OOPS.EncapsulationAndInheritance.Inheritance.Challenge83;

public class ArrayOperation {
    private int[] numbers;

    

   

    public ArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }





    // public class Statistics(){

        double mean(){
            double sum = 0;
            for(int number : numbers){
                sum += number;
            }
            return sum / numbers.length;

        }
        // double median(){

        }

    


