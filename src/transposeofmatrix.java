import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class transposeofmatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter  row");

        int row=s.nextInt();
        System.out.println("enter column");
        int coloumn=s.nextInt();
        int[][] matrix=new int[row][coloumn];
        int[][] transpose=new int[coloumn][row];
        for (int i=0;i<row;i++){
            for (int j=0;i<coloumn;i++){
                matrix[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;i<coloumn;i++){
                transpose[j][i]=s.nextInt();
            }
        }
        System.out.println("transponse matrix");
        for (int i=0;i<row;i++){
            for (int j=0;i<coloumn;i++){
                System.out.print(transpose[i][i]+" ");
            }
            System.out.println();
        }
    }
}
