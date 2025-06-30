
import java.io.FileOutputStream;

public class fileoutputstream {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("two.mp3")){
            System.out.println("binary file created successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
