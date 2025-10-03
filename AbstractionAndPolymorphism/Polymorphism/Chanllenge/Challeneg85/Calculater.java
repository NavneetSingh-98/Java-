package AbstractionAndPolymorphism.Polymorphism.Chanllenge.Challeneg85;

public class Calculater {

    public int sum(int a , int b){
        return a+b;
    }
    public int sum(int a , int b, int c){
        return a+ b+ c;
    }
  
 public static void main(String[] args) {
    Calculater calculater = new Calculater();
    System.out.println(calculater.sum(5,5));
    System.out.println(calculater.sum(5, 6,7));
    
 }


}
