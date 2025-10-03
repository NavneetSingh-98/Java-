package FunctionalAndProgramming.FilterAndReduce.Filter;

import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        
        List<String> list = List.of("banana","papaya","orange","strwberry","dates","mango","cherry","pineapple");

        System.out.println(list.size());
        for (String lists : list) {
            System.out.println(lists);
        }
        list.stream()
            .filter(s -> s.endsWith("e"))
            .forEach(s -> System.out.println(s));
    }

}
