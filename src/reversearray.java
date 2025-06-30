import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array elements");
        int n = s.nextInt();
        int a1[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = s.nextInt();
        }
        System.out.println("array elements are");
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        for (int i=a1.length - 1;i >=0;i--){
            System.out.println("reverse array is"+" "+a1[i]);
        }

    }
}