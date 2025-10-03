package ControlAndStatementAndMath.StringBufferStringBuilder;

public class StringBufferStringBuilder {
    // public static void main(String[] args) {
        
    //     StringBuilder sentence = new StringBuilder("This the is Line");
    //     sentence.append("Added word ");
    //     sentence.append("What is your name");
    //     sentence.append("My name is Navneet");

    //     System.out.println(sentence.toString());
    // }
    public static void main(String[] args) {
        StringBuilder sent = new StringBuilder("This is a BMW X6M Compitition");
        sent.append("Top speed is 300km/h");
        sent.append("Price in India 1.21cr");
        sent.append("Sport Looking ");

        System.out.println(sent.toString());
    }

}
