package ExceptionAndFileHandling.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        
        String fileName = "javaFile.txt";
        try(FileReader reader = new FileReader(fileName)){

            int read = 0;
            do{
                read = reader.read();
                System.out.println((char)read);
            }while(read != -1);
        }catch(IOException e){
            System.out.printf("Exception Occured %s",e.getMessage());
        }
    }

}
