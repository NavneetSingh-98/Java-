package ControlAndStatementAndMath.MathClass;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("Welcome in the Math Class ");

      System.out.println(Math.abs(-9.9));  // Absolute value if user give negative value then convert Positive value;
      System.out.println(Math.ceil(99.6)); //Round Up 
      System.out.println(Math.floor(99.9));  //Rounds Down 
      System.out.println(Math.round(5.9)); // Round Nearest  Number 
      System.out.println(Math.round(5.1)); //Round nearest Value 

      System.out.println(Math.max(4, 6)); //Find Max 
      System.out.println(Math.min(5, 8)); //Find Min 

      System.out.println(Math.sqrt(4));

      System.out.println(Math.random() );


      //Random number Genrater 
      for(int i = 0; i< 10; i++){
        int  random = (int)(Math.random() * 10 );
        System.out.println(random);
      }
           
    }

}
