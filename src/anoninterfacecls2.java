interface queen{
    void add(int a,int b);
    void sub(int a,int b);
}
interface king{
    void mul(int a,int b);
}
public class anoninterfacecls2 {
    public static void main(String[] args) {
        queen q=new queen() {
            @Override
            public void add(int a,int b) {
                System.out.println( a+ b);
            }

            @Override
            public void sub(int a,int b) {
                System.out.println( a- b);
            }
        };
        king k=new king() {
            @Override
            public void mul(int a, int b) {
                System.out.println( a* b);
            }
        };
        q.add(10,20);
        q.sub(10,20);
        k.mul(10,20);
    }
}
