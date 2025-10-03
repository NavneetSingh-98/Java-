package EncapsulationAndInheritance.Inheritance.Challenge80;

public class TestClass {
    public static void main(String[] args) {
        
        Book book = new Book();
        DVD dvd = new DVD();
        Magazine magazine = new Magazine();

        book.checkout();
        dvd.checkout();
        magazine.checkout();
    }

}
