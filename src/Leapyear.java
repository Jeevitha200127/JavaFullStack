import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a=");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) | (year % 400 == 0)) {
            System.out.println("leap year");
        }
        else{

            System.out.println("not leap year");

        }
    }
}