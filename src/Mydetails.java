import java.util.Scanner;

public class Mydetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String s=sc.next();
        System.out.println("name:"+s);
        //.......//
        System.out.println("enter usn");
        String s1=sc.next();
        System.out.println("usn:"+s1);
        //.......//
        System.out.println("enter branch");
        String s2=sc.next();
        System.out.println("branch:"+s2);
        //.......//
        System.out.println("enter cgpa");
        float f=sc.nextFloat();
        System.out.println("cgpa:"+f);

    }
}
