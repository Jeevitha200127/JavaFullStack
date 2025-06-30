package featurejava8;

import java.util.Scanner;

interface o{
    void add(int a,int b);
}
interface u{
    void sub(int c,int d);
}
interface j{
    void mul(int e,int f);
}
public class method3intfc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        o o1=(a,b)->System.out.println("add"+(a + b));
o1.add(a,b);

        u u1=(c,d)->System.out.println("sub"+(c + d));
        u1.sub(c,d);
        j j1=(e,f)->System.out.println("sub"+(e + f));
        j1.mul(e,f);

    }
}