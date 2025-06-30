import java.io.File;

public class filehandling {
    public static void main(String[] args) throws Exception{
        String t = "ab.txt";
        File file = new File(t);
        if (file.createNewFile()) {
            System.out.println("file created successfully");
        } else {
            System.out.println("try again");
        }

    }
}