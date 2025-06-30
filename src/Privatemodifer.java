class privateaccess{
    private String name="jee";
    private void pdetails(){
        System.out.println(name);
    }
    void deatils(){
        pdetails();
    }
}







public class Privatemodifer {
    public static void main(String[] args) {
        privateaccess p=new privateaccess();
        p.deatils();

    }
}
