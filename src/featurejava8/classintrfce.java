package featurejava8;
interface G{
    default void run(){
        System.out.println("hi1");
    }
}
interface H{
    default void run(){
        System.out.println("hi2");
    }
}
class J implements H{
    public void run(){
        System.out.println("hi3");
    }

}
class K extends J implements H{
    public void run(){
        System.out.println("hi4");
    }
}
public class classintrfce {
    public static void main(String[] args) {
        K g1=new K();
        g1.run();
    }

}
