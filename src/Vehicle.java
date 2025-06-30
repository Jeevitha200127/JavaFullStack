class car{
    String cname;
    int model;
    String Colour;
    double price;
    car(String n,int m,String c,double p){
        cname=n;
        model=m;
        Colour=c;
        price=p;
    }

//    car(String n,int m,String c){
//        cname=n;
//        model=m;
//        Colour=c;
//
//    }
//    car(String n,int m,String c){
//    cname=n;
//    model=m;
//        Colour=c;
//
//

    public  void carDetails(){
        System.out.println(cname+" "+model+" "+Colour+" "+price);
    }
}



public class Vehicle {
    public static void main(String[] args) {
        car c=new car("lamb",2001,"blue",2.00000);
        c.carDetails();
        car c1=new car(" ",2002,"red",0.0);
        c1.carDetails();
    }
}