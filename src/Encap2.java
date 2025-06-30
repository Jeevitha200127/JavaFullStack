class people{
    String name="navya";
    String branch="ec";
    String rollno="1db19cs089";
    String address="mandya";
    public  void setName(String name){
        this.name=name;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public String getRollno(){
        return  rollno;
    }
    public String getAddress() {
        return address;
    }
}
public class Encap2 {
    public static void main(String[] args) {
        people p1=new people();
        p1.setName("puppy");
        p1.setBranch("cs");
        p1.setRollno("1db19cs062");
        p1.setAddress("maddur");
        System.out.println(p1.getName());
        System.out.println(p1.getBranch());
        System.out.println(p1.getRollno());
        System.out.println(p1.getAddress());
    }
}
