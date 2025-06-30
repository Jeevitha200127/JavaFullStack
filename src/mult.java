class college{
    String cname;
    String caddress;
    college(String cname,String caddress){
        this.cname=cname;
        this.caddress=caddress;
    }
    void collegedetails(){
        System.out.println(cname+" "+caddress);
    }
}
class department1 extends college{
    String dname;
    String tname;
   department1(String cname,String caddress,String dname,String tname){
       super(cname,caddress);
       this.dname=dname;
       this.tname=tname;

   }

//    department1(String cname,String caddress) {
//        super(cname,caddress);
//this.dname=dname;
//this.tname=tname;
//    }




    void collegedetails(){
        super.collegedetails();
        System.out.println(dname+" "+ tname);
    }
}
class student extends department1 {
    String sname;
    String rollno;

    student( String cname,String caddress,String dname,String tname, String sname,String rollno) {
        super(dname, tname,cname,caddress );
        this.sname=sname;
        this.rollno = rollno;
    }

    void collegedetails() {
        super.collegedetails();
        System.out.println(sname+" "+rollno);
    }
}
public class mult {
    public static void main(String[] args) {
        student s=new student("jeevitha","rohini","cs","deepthi","chaithra","1db");
        s.collegedetails();
    }
}
