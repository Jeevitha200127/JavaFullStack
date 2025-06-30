import java.util.Scanner;




public class Largestthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a=");
        int a = sc.nextInt();
        System.out.println("enter the value of a=");
        int b = sc.nextInt();
        System.out.println("enter the value of b=");
        int c = sc.nextInt();
        System.out.println("enter the value of c=");
        if (a >= b && a >= c) {
            System.out.println("a is large");
        } else if (b >= c && b >= a) {

            System.out.println("b is large");
        } else {
            System.out.println("c is large");
        }
    }
}