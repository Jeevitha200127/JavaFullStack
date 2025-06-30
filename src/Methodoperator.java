import java.util.Scanner;

class Alloperator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println(a + b);
        } else {
            System.out.println("denominator should not be zero");
        }
    }

    public void multiply(int a, int b) {


        System.out.println(a * b);

    }
}
public class Methodoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Alloperator al=new Alloperator();
        al.add(a,b);
        al.sub(a,b);
        al.div(a,b);
        al.multiply(a,b);

    }
}
