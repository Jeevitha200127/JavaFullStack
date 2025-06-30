class Animall{
    String color;
    String type;
    Animall(String color,String type){
        this.color=color;
        this.type=type;
    }
    void details(){
        System.out.println(color+" "+type);
    }

}
class dog1 extends Animall{
    String name;
    dog1(String color,String type,String name){
        super(color,type);
        this.name=name;
    }
    void details(){
        super.details();
        System.out.println(name);
    }
}
class babydog extends dog1{
    String gender;

    babydog(String color, String type, String name,String gender) {
        super(color, type, name);
        this.gender = gender;
    }
    void details(){
        super.details();
        System.out.println(gender);
    }
}
public class multilev {
    public static void main(String[] args) {
        babydog b=new babydog("black","carnivorous","jai","Male");
        b.details();
    }
}
