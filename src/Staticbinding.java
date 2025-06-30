class Aaaa{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public  static int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Staticbinding {
    public static void main(String[] args) {
       int res=Aaaa.add(10,20);
//        System.out.println(Aaaa.add(10,20));
//        System.out.println(Aaaa.add(10,20,30));
        System.out.println(res);
        int res1=Aaaa.add(40,20,30);
        System.out.println(res1);
    }
}
