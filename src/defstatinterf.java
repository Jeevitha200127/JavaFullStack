interface E{
    static void show(){
        System.out.println("static method");
    }
    default void display(){
        System.out.println("default method");
    }
}
class r implements E{
    public void display(){
        System.out.println("static");
    }

}
public class defstatinterf {
    public static void main(String[] args) {
        r r1=new r();
        r1.display();
        E.show();
    }
}
