class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
    void display(){
        System.out.println("B display");
    }
}
class C extends B{
    void show() {
        System.out.println("C");
    }
        void run(){
            System.out.println("c diaplay");
        }

}
public class multilevel {
    public static void main(String[] args) {
        C c1=new C();
        c1.show();
        c1.run();
    }
}
