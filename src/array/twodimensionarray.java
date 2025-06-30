package array;

public class twodimensionarray {

        public static void main(String[] args) {
            int a1[][]={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
        for (int i=0;i<a1.length;i++) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[i][j] + " ");
            }

            System.out.println();
        }
            //2)diagonal matrix

           /*System.out.println("normal diagonal");
           for (int i = 0; i < a1.length; i++) {
                System.out.print(a1[i][i] + " ");
            }
            System.out.println();*/


            //3)reverse diagonal matrix,.
        /*for (int i = 0; i<a1.length; i++) {
            System.out.print(a1[i][a1.length-1-i] + " ");
        }*/
        }
    }


