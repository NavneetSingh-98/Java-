package FunctionalAndProgramming.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers : ");

        for(int i = 0; i< 5; i++){
            numbers.add(input.nextInt());
        }
        numbers.stream()
        .forEach(n -> System.out.println(n));
    }

}
