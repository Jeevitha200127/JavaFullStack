interface A1{
    public void display();
}
class B1 implements A1{

    public void display(){
        System.out.println("fetch the details");
    }
}





public class Interface {

    public static void main(String[] args) {
        B1 b=new B1();
        b.display();
    }
}
