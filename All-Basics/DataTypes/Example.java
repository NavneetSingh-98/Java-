public class Example {
    public static void main(String[] args) {
        // DataTypes 
          // whole Number 
            // byte
            // short 
            // int 
            // long
            byte age = 20;
            short age1 = 20;
            int age2 = 20;
            long age3 = 20;

            System.out.println(Byte.MIN_VALUE);
            System.out.println(Byte.MAX_VALUE);

            System.out.println(Short.MIN_VALUE);
            System.out.println(Short.MAX_VALUE);

            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);

            System.out.println(Long.MIN_VALUE);
            System.out.println(Long.MAX_VALUE);
        
        // decimal 
          // float
          // double

          float mySalary = 100.2000000000000012121f;
        System.out.println(mySalary);
          double yourSalary = 100.1212121212;
        System.out.println(yourSalary);
          
          
        // characters
        // Char

        char intial = 'A';
        System.out.println((int) intial);
        System.out.println((char) 10084);
        
        //boolean
         // boolean 

         boolean isDigit = true;
         System.out.println(isDigit);



         //Increment \\ Decrement 

         int a = 99;
         int b = a++;
        System.out.println(b);
         System.out.println(a);

         int x = 12;
         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);

         short u = 8;
         System.out.println(Short.MAX_VALUE);
         System.out.println(Short.MIN_VALUE);

         double f = 8.009;
         System.out.println(Double.MAX_VALUE);
         System.out.println(Double.MIN_VALUE);

         int c = 50;
         int d = c--;
         System.out.println(d);
         System.out.println(c);

         int g = 60;
         int h = --g;
         System.out.println(g);
         System.out.println(h);

         int i = 90;
         System.out.println(i);
         int j =  i--;
         System.out.println(j);

         String name = "Navneet";
         String name1 = "Navneet";

         if(name.equals(name1)){
          System.out.println("equals");
         }else{
          System.out.println("not equals");
         }
         
    }

}
