class fruit{
    String season;
    fruit(String season){
        this.season=season;
    }
    void details(){
        System.out.println(season);
    }
}
class apple extends fruit{
String color;
    apple(String season,String color) {
        super(season);
    }
    void details(){
        super.details();
        System.out.println(color);
    }
}
class mango extends fruit{
String name;
    mango(String season,String name) {
        super(season);
        this.name=name;
    }
    void details(){
        super.details();
        System.out.println(name);
    }
}
public class hierar2 {
    public static void main(String[] args) {
        mango m=new mango("rainy","sothapuri");
        m.details();
    }
}
