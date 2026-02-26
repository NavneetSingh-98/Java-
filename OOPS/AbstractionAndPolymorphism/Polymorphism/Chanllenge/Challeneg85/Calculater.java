package OOPS.AbstractionAndPolymorphism.Polymorphism.Chanllenge.Challeneg85;



public class Calculater {
    
    public int sum(int a, int b) {
        return a+b;
    }
    public int sum(int a , int b , int c){
        return a+ b + c;
    }

    public double sum(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        Calculater calculater = new Calculater();
        System.out.println(calculater.sum(3,5));
        System.out.println(calculater.sum(3,4, 07));
        System.out.println(calculater.sum(3.3, 5.5));

    
    }
}
