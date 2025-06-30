class twowheeler{

public static void ride(int a, int b, int c){
        System.out.println(a+b+c);

        }



}
class activa extends twowheeler{


    public static void ride(int a,int b,float c){
        System.out.println(a+b+c);

    }

}







public class Methodoveriding {
    public static void main(String[] args) {
        activa t=new activa();
        t.ride(10,20, 30);
        t.ride(10,20,1.0f);
    }
}
