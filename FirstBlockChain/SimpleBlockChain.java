package FirstBlockChain;

public class SimpleBlockChain {
    public static void main(String[] args) {

        Block block1 = new Block("A sends 100 Ruppes to B", "0");

        Block block2 = new Block("B sends 50 Ruppes to C", block1.hash);

        Block block3 = new Block("C sends 40 Ruppes to D" , block2.hash);

        Block block4 = new Block("D sends 20 Ruppes to E", block3.hash);

        System.out.println("Block 1");
        System.out.println("Data : "+ block1.data);
        System.out.println("TimeStamp : " + block1.timestamp);
        System.out.println("Hash : " + block1.hash);
        System.out.println();

        System.out.println("Block 2");
        System.out.println("Data : "+ block2.data);
        System.out.println("TimeStamp : " + block2.timestamp);
        System.out.println("Hash : " + block2.hash);
        System.out.println();

        System.out.println("Block 3");
        System.out.println("Data : "+ block3.data);
        System.out.println("TimeStamp : " + block3.timestamp);
        System.out.println("Hash : " + block3.hash);
        System.out.println();

        System.out.println("Block 4");
        System.out.println("Data : "+ block4.data);
        System.out.println("TimeStamp : " + block4.timestamp);
        System.out.println("Hash : " + block4.hash);
        System.out.println();
    
}

}
