class Monkey{
    public void rain(int a,int b){
        System.out.println(a+b);
    }
    public void rain(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void rain(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
}

public class Methodoverloading {
    public static void main(String[] args) {
        Monkey mc=new Monkey();
        mc.rain(10,20);
//        mc.rain(10,20,30);
        mc.rain(10,20,30,40);
    }
}
