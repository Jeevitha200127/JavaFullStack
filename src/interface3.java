interface collegee{
    public void BE(String collegename,int years,double percentage);
    public void PUC(String collegename,int years,double percentage);
    public  void SSLC(String schoolname,int years,double percentage);
}
class college1 implements collegee{
    @Override
    public void BE(String collegename,int years,double percentage) {
        System.out.println("BEcollegename:"+" "+collegename+" "+"BEyears:"+" "+years+" "+"BEpercentage:"+" "+percentage);
    }
    @Override
    public void PUC(String collegename, int years,double percentage) {
        System.out.println("PUcollegename:"+" "+collegename+" "+"PUyears:"+" "+years+" "+"PUpercentage:"+" "+percentage);
    }
    @Override
    public void SSLC(String schoolname, int years, double percentage) {
        System.out.println("SSLCschoolname:"+schoolname+" "+"SSLCSchoolyears:"+" "+years+" "+"SSLCSchoolpercentage:"+" "+percentage);
    }
}
public class interface3 {
    public static void main(String[] args) {
        college1 c=new college1();
        c.BE("dbit",2021,70.1);
        c.PUC("mandavya  excellence pu college" ,2,72.1);
        c.SSLC("poorna prajna convent,",1,88.2);
    }
}
