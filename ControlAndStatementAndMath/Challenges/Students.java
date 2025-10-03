package ControlAndStatementAndMath.Challenges;

public class Students {

    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }

 public static void main(String[] args) {
    Students students = new Students("Navneet", 20);
    System.out.println(students);
 }
}
