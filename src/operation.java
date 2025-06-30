class addition{
    public void add(float a,float b){
        System.out.println("addition of 2 number"+" "+(a+b));
    }
    public void add(float a,float b,float c){
        System.out.println("addition of 3 number"+" "+(a+b+c));
    }
}




public class operation {
    public static void main(String[] args) {
        addition a=new addition();
        a.add(7.1f,3.2f);
        a.add(3.2f,5.6f,9.4f);

    }
}
