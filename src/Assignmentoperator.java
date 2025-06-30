import java.util.Scanner;

public class Assignmentoperator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a=");
        int a = sc.nextInt();
        System.out.println("enter the value of b=");
        int b = sc.nextInt();

        System.out.println("+="+(a+=2));
        System.out.println("-="+(a-=1));
        System.out.println("-="+(a*=2));

    }
}
