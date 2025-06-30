
class F{
   public void run(){
        System.out.println("parent");
    }


}
class G extends F{
    public void run(){
        System.out.println("child");
    }
}
public class Dynamicbinding {
    public static void main(String[] args) {
        F f1=new G();

        f1.run();

    }
}
