interface E1{
    void add(int a,int b);
    void sub(int a,int b);
}







public class anonclsinterface {
    public static void main(String[] args) {
        E1 e=new E1(){
        public void add(int a,int b){
            System.out.println(a+b);
        }
        public void sub(int a,int b){
            System.out.println(a-b);
        }
        };
        e.add(10,20);
        e.sub(10,50);
    }
}
