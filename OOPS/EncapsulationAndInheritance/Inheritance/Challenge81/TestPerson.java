package OOPS.EncapsulationAndInheritance.Inheritance.Challenge81;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Navneet", 22, 001);

       System.out.println(person.getName()); 
       System.out.println(person.getAge());
       System.out.println(person.getRollNumber());   
       System.out.println( person.hashCode());
       System.out.println( person.toString());

        person.setAge(25);
        person.setName("Naveen");
        person.setRollNumber(004);

        System.out.println(person);
    }
}
