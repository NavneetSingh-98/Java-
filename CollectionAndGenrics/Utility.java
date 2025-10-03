package CollectionAndGenrics;

import java.util.Collection;

public class Utility {
    // public static void print(Collection collection ){

    //     System.out.print("Collection is : ");
    //     for (Object coll : collection) {
    //         System.out.printf(" %s ",coll.toString());
            
    //     }

    // }
    public static void  print(Collection collection){
     System.out.println("Collection is : ");
     for(Object coll : collection){
        System.out.printf(" %s ",coll.toString());
     }
    }
       
    

}
