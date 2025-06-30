package featurejava8;
interface A9{
    default void run(){
        System.out.println("hi");
    }
}
class B9 implements A9{

}


public class intfcStaticAbstrtMethd {
    public static void main(String[] args) {
        A9 aa = new B9();
        aa.run();
    }
}
