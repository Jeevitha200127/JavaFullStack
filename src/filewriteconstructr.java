import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class filewriteconstructr {
    public static void main(String[] args) throws IOException {
        String a="abcd.csv";
        String content="hyderabad";
        Files.write(Paths.get(a),content.getBytes());
        System.out.println("hello");
    }
}
