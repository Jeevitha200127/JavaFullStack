import java.io.FileOutputStream;

public class fileoutputsreamconstructr {
    public static void main(String[] args) {
        String a="abcd.txt";
        String content="hi ";
        try(FileOutputStream fos=new FileOutputStream(a)){
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("inserted successfully");
            fos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
