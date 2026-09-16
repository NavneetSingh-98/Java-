package OOPS.EncapsulationAndInheritance.Challenges.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Navneet", 20, 50000);
        System.out.println(employee);
        employee.setName("SHIVAM KUMAR");
        System.out.println(employee.getName());
        employee.setAge(25);
        System.out.println(employee.getAge());
        employee.setSalary(49000);
        System.out.println(employee.getSalary());
    }

}
