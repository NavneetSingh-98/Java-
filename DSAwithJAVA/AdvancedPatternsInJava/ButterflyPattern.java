package DSAwithJAVA.AdvancedPatternsInJava;

public class ButterflyPattern {
    public static void main(String[] args) {
        
        System.out.println("Butterfly Pattern");

        int n  =5;
        // First Half  - Upper 
        for(int i=1; i<= n; i++){
            for(int j =1; j<= i; j++){
                 System.out.print("*");

            }
             //space
             int space  = 2 * (n -i);
        for(int j = 1; j<= space; j++){
            System.out.print(" ");
        }
        //2nd part
        for(int j=1; j<= i;j++){
            System.out.print("*");
        
        }
        System.out.println();
           
        }
        //Lower Half 
            for(int i=n; i>= 1; i--){
            for(int j =1; j<= i; j++){
                 System.out.print("*");

            }
             //space
             int space  = 2 * (n -i);
        for(int j = 1; j<= space; j++){
            System.out.print(" ");
        }
        //2nd part
        for(int j=1; j<= i;j++){
            System.out.print("*");
        
        }
        System.out.println();
           
        }
       
       
    }

}
