class outer{
    private int a=10;
    class inner{
        public int getvalue(){
            return  a;
        }
    }
}
public class inrclsprvtvari {
    public static void main(String[] args) {
        outer obj1=new outer();//outside class
        outer.inner obj2=obj1.new inner();///inside class
        System.out.println(obj2.getvalue());
    }
}
