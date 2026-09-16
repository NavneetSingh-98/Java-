package OOPS.ClassAndObjects.Student;

public class ClassStudent {

    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public static void main(String[] args) {
        ClassStudent s1 = new ClassStudent();
        s1.age = 20;
        s1.name = "Navneet";
        // System.out.println(s1.age);
        // System.out.println(s1.name);
        s1.printName();
    }

}
