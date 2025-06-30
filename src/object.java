class car1 {
    String colour;
    String model;
    car1(String colour, String model)
    {
        this.colour=colour;
        this.model=model;
    }
    void cardetails(){
        System.out.println("carcolour:"+ colour+ " "+"carmodel"+ model);
    }
}
class bmw extends car1 {
    String fueltype;
    bmw( String colour,String model,String fueltype) {
        super(colour, model);
        this.fueltype = fueltype;
    }
    void bmwdetails() {
        System.out.println("bmwcolour:"+colour+" "+"fueltype:"+fueltype+" "+"bmwmodel:"+" "+model);
    }
}
public class object {
    public static void main(String[] args) {
        bmw b=new bmw("red","2001","petrol");
        b.bmwdetails();
        b.cardetails();
    }
}


