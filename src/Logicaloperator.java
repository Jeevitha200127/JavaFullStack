import java.util.Scanner;

public class Logicaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a=");
        int a=sc.nextInt();
        System.out.println("enter the value of b=");
        int b=sc.nextInt();

        System.out.println("and"+" "+(a>b&& a==b));
        System.out.println("or"+" "+(a!=b&&a<b));
        System.out.println("not "+" "+(!(a!=b||a<b)));

    }
}
