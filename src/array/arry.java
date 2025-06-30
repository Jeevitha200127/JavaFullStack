package array;

import java.util.Scanner;

public class arry {
        public static void main(String[] args) {
       /* 1) int array[]={3,1,2,6,8,3};
        array[3]=20;
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
    }*/

        /* 2) char arr[] = {'j', 'e', 'e', 'v', 'i', 't', 'h', 'a'};
        arr[2]='h';
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }*/

       /* 3) int array[]={4,1,7,2,8,5,8};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int sum=0;
        for (int i1=0;i1<array.length;i1++){
            sum=sum+array[i1];
        }
        System.out.println("sum"+" "+sum);  */

        /* 4)int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/

            Scanner s=new Scanner(System.in);
            System.out.println("enter the size of the array elements");
            int n=s.nextInt();
            int a1[]=new int[n];
            System.out.println("enter the array elements");
            for (int i=0;i<a1.length;i++){
                a1[i]=s.nextInt();
            }
            System.out.println("array elements are");
            for (int i=0;i<a1.length;i++){
                System.out.println(a1[i]);
            }
        }
    }


