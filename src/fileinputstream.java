import java.io.FileInputStream;

public class fileinputstream {
    public static void main(String[] args) {
        String a="images/wood-flight-bird-326900.jpg";
        try(FileInputStream stream=new FileInputStream(a))
        {
            int ch;
            while((ch=stream.read())!=-1){
                System.out.println(ch);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


