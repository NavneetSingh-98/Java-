package ExceptionAndFileHandling.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String fileName = "first-java.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("This is my first File Writer ");
            for(int i = 0; i< 10 ; i++){
                writer.write("*");
            }
            writer.flush();
            System.out.println("File Written Succesfully");
        }catch(IOException e){
            System.out.printf("Exception Occured %s ", e.getMessage());
        }
    }

}
