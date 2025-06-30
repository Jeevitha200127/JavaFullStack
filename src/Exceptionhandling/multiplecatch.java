package Exceptionhandling;

public class multiplecatch {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
       catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound");
       }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}