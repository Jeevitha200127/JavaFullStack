public class breakstatement {
    public static void main(String[] args) {
        int x=10;
        while(x<20){
            {
                if(x==15){
                    break;
                }
                System.out.println(x);
                x++;
                System.out.println("");
            }
        }
    }
}
