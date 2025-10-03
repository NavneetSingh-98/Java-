package CollectionAndGenrics.Challenges;

public class Challenge89 {
    public static void main(String[] args) {
    System.out.println(concatenate("Navneet"));
      System.out.println(concatenate("I  am Learning Java"));
        System.out.println(concatenate("This is my First Programing Language"));
          System.out.println(concatenate("I almost complete Java Language "));

    }
    public static String concatenate(String... strs){
        
        // Concatenate Strings 

        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
      
    }

}
