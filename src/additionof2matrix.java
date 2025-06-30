import java.util.Scanner;

public class additionof2matrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows and column");
        int row = s.nextInt();
        int column = s.nextInt();
        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] matrix3=new int[row][column];
        System.out.println("enter elements for matrix1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }
        System.out.println("enter elements for matrix2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = s.nextInt();
            }

        }
        System.out.println("addition of matrix1 and matrix2");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                matrix3[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("print matrix3");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
               System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("fetch 1st element");
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1.length;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("fetch 2nd element");
        for (int i=0;i<matrix2.length;i++){
            for (int j=0;j<matrix2.length;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
    }
}