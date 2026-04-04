package ControlAndStatementAndMath.Challenges;

public class Students {

    String name;
    int age;
    String address;
    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        Students students = new Students("Navneet", 20, "New Delhi ");

        System.out.println(students);
    }

}
