package ControlAndStatementAndMath.Challenges;

public class StudentsDetails {

    String name;
    int age;
    long PhoneNumber;
    public StudentsDetails(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
       return "[ Student Name : " + name + " age : "+ age+ "Phone Number : "+ PhoneNumber+"]";
    }
    public static void main(String[] args) {
        StudentsDetails studentsDetails = new StudentsDetails("Navneet", 22, 876565655);
        System.out.println(studentsDetails);
    }

}
