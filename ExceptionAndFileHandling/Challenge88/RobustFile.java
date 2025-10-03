package ExceptionAndFileHandling.Challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the file name you wish to read : ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            while((read = reader.read()) != -1){
                System.out.println((char) read);
            }
           
        }catch(FileNotFoundException exception){
            System.out.printf("Exception Occured %s ",exception.getMessage());
        }catch(IOException e){
            System.out.printf("Exception Occured %s ",e.getMessage());
        }
    }

}
