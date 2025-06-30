interface dogy{
    void dog1( String name,String breed,String colour);

}
interface cat{
    public void cat(String name,  String colour);


}
class cad {
    public void dog1(String name, String breed, String colour) {
        System.out.println("dog name");
        System.out.println(name+" "+breed+" "+colour);
    }
    public void cat(String name,  String colour) {
        System.out.println("cat name");
        System.out.println(name+" "+" "+colour);
    }
}
public class doganimal {
    public static void main(String[] args) {
        cad y=new cad();
        y.dog1("puppy","gk","brown");
        y.cat("pinky","white");
    }
}
