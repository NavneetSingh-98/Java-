package FunctionalAndProgramming.Challenges.Challenge112;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(tOptional(null));
        System.out.println(tOptional(""));
        System.out.println(tOptional("pop"));
        
    }
    public static Optional<String>tOptional(String str){
        if(str == null || str .isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());

    }

}
