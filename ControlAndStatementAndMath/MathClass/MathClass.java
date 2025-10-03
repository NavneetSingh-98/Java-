package ControlAndStatementAndMath.MathClass;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("Welcome in the Math Class ");


        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(3.3));
        System.out.println(Math.floor(4.90));
        System.out.println(Math.round(1.1));
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(5, 3));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.sqrt(8));
        System.out.println(Math.random());
        System.out.println(Math.ceil(2.2));
        
        
// Random Number Genrater 
        for(int i = 1; i< 10; i++){
             double random = Math.ceil(Math.random() * 10);
            System.out.println(random);

        }
       
    }

}
