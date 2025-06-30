import java.nio.file.Files;

import java.nio.file.Files;
import java.nio.file.Paths;





public class fileswritemethod {
    public static void main(String[] args) {
        String a="java.txt";
        try{
            Files.write(Paths.get(a),"Hello raj".getBytes());
            System.out.println("file created successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }







}
