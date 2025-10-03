package FunctionalAndProgramming.Challenge.Challenge107;

import java.util.List;

public class StringToStream {
    public static void main(String[] args) {
        List<String> names = List.of("Navneet","Shivam","Manju","Vijay");

        names.stream()
             .forEach(name -> System.out.println(names));
    }

}
