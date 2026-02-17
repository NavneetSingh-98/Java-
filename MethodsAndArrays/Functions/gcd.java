package MethodsAndArrays.Functions;

import java.util.Scanner;

public class gcd {

//     public static void main(String[] args) {
    
//     // GCD 
//     Scanner input= new Scanner(System.in);
//     System.out.print("Enter Your First Number : ");
//     int first =input.nextInt();

//     System.out.print("Enter Your Second Number : ");
//     int second = input.nextInt();
//     int gcd = gcdFinder(first, second);
//     System.out.println("Your gcd is : " + gcd);

// }
// public static int gcdFinder(int first, int second){
//     int gcd = 1;
//     int i = 2;
//     int least = least(first, second);

//     while(i <= least){
//         if(first % i == 0 && second % i ==0){
//             gcd = i;
            
//         }
//         i++;
//     }
//     return gcd;
// }
// public static int least(int first ,int second){
//     if(first <second){
//         return second;
//     }else{
//     return first;
//     }
// }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your First Number : ");
    int first = input.nextInt();

    System.out.println("Enter Your Second Number : ");
    int second = input.nextInt();

    int gcd  = gcdFinder(first, second);
    System.out.println("Your gcd is : " + gcd);


}

public static int gcdFinder(int first , int second){
    int gcd = 1; 
    int i = 2;
    int least = leastFinder(first, second);
    while (i <= least) {
        if(first % i == 0 && second % i == 0){
             gcd  = i; 
        }
        i++;
        
    }
    return gcd;

}
public static int leastFinder(int first , int second){
    if(first < second){
        return second;
    }else{
        return first;
    }
}

}
