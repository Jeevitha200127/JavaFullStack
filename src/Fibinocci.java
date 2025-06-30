import java.util.Scanner;

public class Fibinocci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=first+second;
        while (sum<=num){
            first=second;
            second=sum;
            sum=first+second;
System.out.println(sum);
        }

    }
}
