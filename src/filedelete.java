import java.io.File;

             public class filedelete {
                 public static void main(String[] args) {
                     File file = new File("abc.txt");
                     if (file.exists()){
                         if (file.delete()) {
                             System.out.println("file deleted");
                         } else {

                             System.out.println("file not deleted");
                         }
                     } else {
                         System.out.println("file doesnot exist");
                     }
                 }
             }
