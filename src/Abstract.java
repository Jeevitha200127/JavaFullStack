abstract class tree{
    abstract void greet();
}
class neem extends tree{
    public void greet(){
        System.out.println("natural ");
    }
}




public class Abstract {
    public static void main(String[] args) {
        neem n=new neem();
        n.greet();
    }
}
