class tree1{
    private class neem {
        void add(String pname, int page) {
            System.out.println(pname + " " + page);
        }
    }
    void show()
    {
        neem n=new neem();
        n.add("navya",89);
    }

}
public class Innnerclass {
    public static void main(String[] args) {
        tree1 t=new tree1();
        t.show();
    }
}