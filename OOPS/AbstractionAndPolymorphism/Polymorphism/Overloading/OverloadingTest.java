package OOPS.AbstractionAndPolymorphism.Polymorphism.Overloading;



public class OverloadingTest {

    public int sum(int a , int b , int c){
    return a+b+c;
    }

    public double sum(double a , double b , double c){
        return a+ b+ c;
    }
    public int sun(int a , int b){
        return  a + b;
}
public static void main(String[] args) {
    OverloadingTest ov1 = new OverloadingTest();

    System.out.println(ov1.sum(5.6, 7.7, 8.8));
    System.out.println(ov1.sum(4.4, 2.2, 6.8));
    System.out.println(ov1.sum(4, 6, 8));
    System.out.println(ov1.sun(50, 80));
}

}
