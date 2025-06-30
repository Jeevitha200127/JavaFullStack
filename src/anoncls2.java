abstract class i{
    abstract void dog(String name,String colour);
    abstract void cat(String name,String colour);
}
public class anoncls2 {
    public static void main(String[] args) {
        i  i1=new i(){
            void dog(String name,String colour){
                System.out.println(name+" "+colour);
            }

            @Override
            void cat(String name, String colour) {
                System.out.println(name+" "+colour);
            }
        };
        i1.dog("jee","blue");
        i1.cat("pinky","white");
    }
}
