package FunctionalAndProgramming.FilterAndReduce.Filter;

import java.util.List;

public class FiltersTesting {
    public static void main(String[] args) {
        
        List<String> list = List.of("Mango","Banana","Cherry");
        System.out.println(list.size());

        for(String lists :list){
            System.out.println(list);
        }
        list.stream()
             .filter(s -> s.endsWith(s))
            .forEach(s-> System.out.println(s));
                
             }
    }


