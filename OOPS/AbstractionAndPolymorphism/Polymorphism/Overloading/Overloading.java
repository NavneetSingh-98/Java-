package OOPS.AbstractionAndPolymorphism.Polymorphism.Overloading;

public class Overloading {

    // Method Overloading  

    public double sum(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }

    public int sum(int a, int b , int c, int d){
        return a+b+c+d;
    }

    public int sum(int a , int b){
        return a + b;
    }
    public static void main(String[] args) {
     
        Overloading overloading = new Overloading();

        System.out.println(overloading.sum(5, 5));
        System.out.println(overloading.sum(3, 3, 3, 3));
        System.out.println(overloading.sum(2, 3, 5, 2, 6));

    }

}
