package featurejava8;
interface A{
    default void run(){
        System.out.println("hi");
    }
}
class B implements A{

}

public class intrceDefaultAbstrctMethd {
    public static void main(String[] args) {
        A aa=new B();
        aa.run();
    }
}
