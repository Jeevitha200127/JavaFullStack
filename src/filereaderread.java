import java.awt.*;
import java.io.FileReader;

public class filereaderread{
    public static void main(String[] args) {
        String a="abc.txt";
        try(FileReader reader=new FileReader(a)){
            int ch;
            while((ch=reader.read())!=-1){
                System.out.println((char)ch);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
