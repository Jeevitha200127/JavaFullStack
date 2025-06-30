abstract class abc1 {
    abstract void student(String sname, String sbranch);

}
abstract class abc2{
    abstract void employ(String ename,String ebranch);
}









public class anonincls3 {
    public static void main(String[] args) {
        abc1 a=new abc1() {
            @Override
            void student(String sname, String sbranch) {
                System.out.println(sname+" "+sbranch);
            }
        };
        abc2 a2=new abc2() {
            @Override
            void employ(String ename, String ebranch) {
                System.out.println(ename+" "+ebranch);
            }
        };
        a.student("kavya","cs");
        a2.employ("navya","ec");
    }
}
