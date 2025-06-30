import java.util.Scanner;

public class Bitwiseoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a=");
        int a=sc.nextInt();
        System.out.println("enter the value of b=");
        int b=sc.nextInt();

        System.out.println("bitwise and"+" "+(a&b));
        System.out.println("bitwise or"+" "+(a|b));
        System.out.println("bitwise xor "+" "+(a^b));
        System.out.println("compliment "+" "+(~a));
        System.out.println("left shift"+" "+(a<<2));
        System.out.println("left shift"+" "+(a<<2));
        System.out.println("left shift"+" "+(a>>2));

    }
}
