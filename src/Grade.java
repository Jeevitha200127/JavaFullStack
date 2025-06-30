import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter the grade");
        int grade= sc.nextInt();
        int marks=sc.nextInt();
        grade= marks/10;
        switch (grade){
            case 10:
                System.out.println("A grade");
                break;
                case 9:
        System.out.println("B grade");
        break;
            case 8:
                System.out.println("C grade");
                break;
            case 7:
                System.out.println("D grade");
                break;
            case 6:
                System.out.println("E grade");
                break;
            case 5:
                System.out.println("F grade");
                break;
            case 4:
                System.out.println("G grade");
                break;
            case 3:
                System.out.println("H grade");
                break;
            case 2:
                System.out.println("I grade");
                break;
            case 1:
                System.out.println("J grade");
                break;
            default:

                System.out.println(" enter a valid grade");
                break;
        }
        }
    }

