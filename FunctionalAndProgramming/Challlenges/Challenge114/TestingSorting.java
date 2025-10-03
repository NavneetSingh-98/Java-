package FunctionalAndProgramming.Challlenges.Challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employeee> employee = List.of(
            new Employeee("Navneet", 2000),
            new Employeee("Gudiya", 1000),
            new Employeee("Shivam", 1000),
            new Employeee("Ram", 1000));
                        
                        employee.stream()
                                .sorted((emp1 ,emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()));
                                // .forEach(System.out::println);
                                System.out.println(employee);


    }

}
