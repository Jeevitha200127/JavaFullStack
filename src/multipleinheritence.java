interface A2{
    void add();
}
interface B2{
    void sub();
}
class c implements A2,B2{
    public void add(){
        System.out.println("hi");
    }

    @Override
    public void sub() {
        System.out.println("good");
    }
}




public class multipleinheritence {
    public static void main(String[] args) {
    c c1=new c();
    c1.add();
    c1.sub();
    }
}
