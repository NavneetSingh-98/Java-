package EncapsulationAndInheritance.Inheritance.EqualsAndHashcode;

public class People {

    private String name;
    private int age;
    private String id;

    public People(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public int hashCode() {
        return age;
        
    }
   
    @Override
    public String toString() {
        return "prople name = "+ name+ " age "+ age + " id"+ id;
    }

    

}
