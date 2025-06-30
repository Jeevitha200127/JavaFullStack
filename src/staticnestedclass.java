class j{
    static class t{
        void demo(){
            System.out.println("static class");
        }
    }
}
public class staticnestedclass {
    public static void main(String[] args) {
        j.t t1 =new j.t();
        t1.demo();

    }
}
