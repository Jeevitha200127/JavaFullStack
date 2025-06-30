class fox{
   private class jackle{
        void emp(String ename,int eid){
            System.out.println(ename+" "+eid);
        }
        void dept(String dname,int did){
            System.out.println(dname+" "+did);
        }
    }
    public void anim(){
       jackle j=new jackle();
       j.emp("pp",33);
       j.dept("hh",45);
    }
}
public class innercls2 {
    public static void main(String[] args) {
        fox f=new fox();
       f.anim();

    }
}
