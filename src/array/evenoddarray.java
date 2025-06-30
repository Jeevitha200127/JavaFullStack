package array;

import java.util.Scanner;



    public class evenoddarray
    {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the size of the array elements");
            int n=s.nextInt();
            int a1[] = new int[n];
            int even=0;
            int odd=0;
            System.out.println("enter the array elements");
            for (int i = 0; i < a1.length; i++) {
                a1[i] = s.nextInt();
            }
            System.out.println("array elements are");
            for (int i = 0; i < a1.length; i++) {
                System.out.println(a1[i]);
            }

            for(int i=0;i<a1.length;i++){
                a1[i]=s.nextInt();
                if(a1[i]%2==0) {
                    even++;
                }
                else {
                    odd++;
                    //System.out.println("even count:"+even);
                }

            }
       System.out.println("even count:"+even);
      System.out.println("odd count:"+odd);

        }

}
