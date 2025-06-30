interface  Animal2{
    public void dog(String name,String breed,String colour);
    public void cat(String name,String colour);
}
class Animal1 implements Animal2{
    public void dog(String name,String breed,String colour){
        System.out.println("dog is barking");
        System.out.println(name+" "+" "+breed+" "+colour);
    }
    public void cat(String name,String colour){
        System.out.println("cat is drinking milk");
        System.out.println(name+" "+" "+colour);
}
}



public class interface2 {
    public static void main(String[] args) {
        Animal1 a=new Animal1();
        a.dog("pinky","lab","brown");
        a.cat("leo","white");

    }
}
