import java.util.Scanner;

class Java{

    public void person(String pname,int page){
        System.out.println(pname+" "+page);
    }
    public void dog(String dcolour,String dname){
        System.out.println(dcolour+" "+dname);
    }
}



public class animal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dog name");
        String dname= sc.nextLine();
        System.out.println("enter dog colour");
        String dcolour= sc.nextLine();
        System.out.println("enter pname");
        String pname=sc.nextLine();
        System.out.println("enter page");
        int page=sc.nextInt();
        Java j=new Java();
        j.person(pname,page);
        j.dog(dname,dcolour);
    }
}
