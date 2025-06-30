import java.io.FileWriter;

public class Filewriterwrite {
    public static void main(String[] args) throws Exception{
        String a="abc.txt";
        FileWriter writer=new FileWriter(a);
        writer.write("hello");
        System.out.println("data inserted successfullyqw6c");
        writer.close();
    }
}
