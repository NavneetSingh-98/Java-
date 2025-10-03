package ControlAndStatementAndMath.Challenges;

public class concatenateString {
    public static void main(String[] args) {

        // Concatenate with the help of StringBuilder
        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append("My name is Navneet");
        // sb.append("My age is ");
        // sb.append(20);
        // sb.append("How are you ");
        // sb.append("Which lenguage you learn");

        // System.out.println(sb.toString());

      // String firstName = "Navneet";
      // String LastName = "Kumar";

      // String fullName = firstName.concat(" ").concat(LastName);
      // System.out.println(fullName.toUpperCase());

      String firstName = "Navneet";
      String LastName = "Rajput";
      String fullName = firstName.concat("").concat(LastName);
      System.out.println(fullName.toUpperCase());
      System.out.println(fullName.toLowerCase());
      System.out.println(fullName.compareToIgnoreCase(LastName));
      System.out.println(fullName.endsWith(fullName));
      System.out.println(fullName.charAt(4));
      System.out.println(fullName.hashCode());
      System.out.println(fullName.indexOf(LastName));
      System.out.println(fullName.isBlank());
      System.out.println(fullName.getClass());
      System.out.println(fullName.toString());
      System.out.println(fullName.split(fullName));
      System.out.println(fullName.contains("Navneet"));
      System.out.println(fullName.lastIndexOf(4));
      System.out.println(fullName.startsWith("N"));
      
    }

}
