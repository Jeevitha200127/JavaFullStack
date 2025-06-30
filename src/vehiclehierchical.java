interface i1{//parent
    void vehicle(int vno,String vcolour);
}
interface i2 extends i1{//child
    void car(String crname,String crcolour,float crprice);
}
interface  i3 extends i1{//child
    void bike(String bname,float bprice,int benggno);
}
class d implements i2,i3{
   public void vehicle(int vno,String vcolour){
        System.out.println("vsound");
       System.out.println(vno+" "+vcolour);
    }
    public void car(String crname,String crcolour,float crprice) {
        System.out.println("csound");
        System.out.println(crname + " " + crcolour + " " + crprice);
    }
    public void bike(String bname,float bprice,int benggno){
       System.out.println("bsound");
        System.out.println(bname+" "+bprice+" "+ benggno);
    }


}


public class vehiclehierchical {
    public static void main(String[] args) {
        d dc=new d();
        dc.vehicle(23,"red");
        dc.car("lambor","green",45677);
        dc.bike("ola",234,67889);
    }
}
