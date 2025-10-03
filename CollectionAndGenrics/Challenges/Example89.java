package CollectionAndGenrics.Challenges;

public class Example89 {
    public static void main(String[] args) {
        // concatenate Strings 

    }
    public static String concatenate(String... strs){

        //concatenate string 
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

}
