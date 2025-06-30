class School{
    public void student(String studname,String studbranch){
        System.out.println(studname+studbranch);
    }
    public void student(String studname,String studbranch,String studaddress){
        System.out.println(studname+studbranch+studaddress);
    }
}








public class methodover2 {
    public static void main(String[] args) {
        School sc=new School();
      sc.student("jee","cs");
        sc.student("jee","cs","maddur");
    }
}
