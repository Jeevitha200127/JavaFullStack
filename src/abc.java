class Bird{
    public void sum(int a,int b){
        System.out.println("addition"+" "+(a+b));
    }
    public int sub(int a,int b){
        return a-b;
    }
}
public class abc {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.sum(2,4);
        int result=b.sub(5,3);
        System.out.println(result);
    }
}
