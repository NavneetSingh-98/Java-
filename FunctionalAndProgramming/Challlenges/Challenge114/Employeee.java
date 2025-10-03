package FunctionalAndProgramming.Challlenges.Challenge114;

public class Employeee {
    private final String name;

    private final int salary;

    public Employeee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employeee [name=" + name + ", salary=" + salary + "]";
    }

    
}
