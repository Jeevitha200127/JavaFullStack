package featurejava8;
interface p{
    void run();
}
public class lamdafunction {
    public static void main(String[] args) {
        p obj=()-> System.out.println("hello");
        obj.run();
    }
}
