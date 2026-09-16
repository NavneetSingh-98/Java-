package ExceptionAndFileHandling.FileWriter;

import java.io.FileWriter;

public class Writers {
    public static void main(String[] args) {
        String fileName = "First.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("This is my first Java File ");
            for(int i = 0; i< 10 ; i++){
                System.out.println( "@");
            
            }
            writer.flush();
            System.out.println("File write succesfully ");
            
            

        }catch(Exception e){
            System.out.printf("Exception Occured %s ", e.getMessage());
        }
    }

}
