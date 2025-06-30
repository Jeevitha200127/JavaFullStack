class x{
    void config(float display,String resolution,String ram){
        System.out.println("iphone:-"+" "+"display:"+" "+display+" "+"resolution:"+" "+resolution+" "+"ram:"+" "+ram);
    }
}

class y extends x{
    void config(float display,String resolution,String ram,String colour){
        System.out.println("vivo:-"+" "+"display:"+" "+display+" "+"resolution:"+" "+resolution+" "+"ram:"+" "+ram+" "+"colour:"+" "+colour);
    }
}






public class mobile {
    public static void main(String[] args) {
        y yc=new y();
        yc.config(15.54f,"2556*1179pixel","128 gb");
        yc.config(16.1f,"1080*2400pixel","256 gb","red");

    }
}
