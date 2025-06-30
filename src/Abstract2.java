abstract class work{
    abstract void employee(String empname,int empid,int empage);
    abstract void department(String depname,int depid);
    void college(){
        System.out.println("DBIT");
    }
}
class worklocation extends work{
    public void employee(String empname, int empid, int empage){
        System.out.println("going to office");
        System.out.println(empname+" "+empid+" "+empage);
    }
    public   void department(String depname,int depid){
        System.out.println("fetching dep id");
        System.out.println(depname+" "+depid);
    }
}







public class Abstract2 {
    public static void main(String[] args) {
        worklocation w=new worklocation();
        w.employee("jee",1,10);
        w.department("cs",2);
        w.college();
    }


}
