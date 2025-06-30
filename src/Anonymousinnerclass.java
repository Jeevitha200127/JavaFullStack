   abstract class u{
    public  abstract void show();
   }
public class Anonymousinnerclass {
    public static void main(String[] args) {
        u obj=new u(){
            public void show(){
                System.out.println("anonomous class");
            }
        };
obj.show();
    }
}
