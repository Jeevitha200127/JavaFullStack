import java.util.Scanner;

public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
int num= sc.nextInt();
        int i=1;
        int sum=0;

        do{
            sum=sum+i;
            i++;
            System.out.println(sum);
        }while(i<=num);

    }
}
