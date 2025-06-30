import java.util.Scanner;

public class Relationaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a=");
        int a=sc.nextInt();
        System.out.println("enter the value of b=");
        int b=sc.nextInt();

        System.out.println("greater than"+" "+(a>b));
        System.out.println("less than"+" "+(a<b));
        System.out.println("equal"+" "+(a=b));
        System.out.println("not equal"+" "+(a!=b));
        System.out.println("greater than equal to"+" "+(a>=b));
        System.out.println("less than equal to"+" "+(a<=b));
    }
}
