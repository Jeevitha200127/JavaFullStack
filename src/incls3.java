class b1{
    class c1{
        public void  name(String name){
            System.out.println("jee");
        }
    }
}
public class incls3 {
    public static void main(String[] args) {
        b1 bb=new b1();
        b1.c1 cc=bb.new c1();
        cc.name("jee");
    }
}
