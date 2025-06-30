import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of age=");
        int age = sc.nextInt();

        if (age >=18) {
            System.out.println("elegible for vote");
        } else {
            System.out.println("not elegible");
        }
    }
}