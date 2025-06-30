import java.util.Scanner;

public class Airthmeticoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a=");
        int a=sc.nextInt();
        System.out.println("enter the value of b=");
        int b=sc.nextInt();

        System.out.println("addition"+(a+b));
        System.out.println("subtraction"+(a-b));
        System.out.println("multiply"+(a*b));
        System.out.println("mod"+(a%b));
        System.out.println("division"+(a/b));

    }
}
