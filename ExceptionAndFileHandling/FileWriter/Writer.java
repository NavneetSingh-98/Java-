package ExceptionAndFileHandling.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        
        String fileName = "java-course.txt";

        try (FileWriter writer = new FileWriter(fileName)){
        
            writer.write("This is the best course of Java \n ");

            for(int i = 1; i<50; i++){
              writer.write('*');
            }
            writer.flush();

            System.out.println("File written succesFully");
        } catch (IOException e) {
            System.out.printf("Exception occured  %s ",e.getMessage());
           
        }
    }

}
