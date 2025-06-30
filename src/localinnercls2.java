class fruit1{
    void apple(){
        class orange{
            void person(String name,int age){
                System.out.println(name+" "+age);
            }
            void dog(String name,String colour){
                System.out.println(name+" "+colour);
            }
        }
        orange o=new orange();
        o.person("jj",12);
        o.dog("kk","red");
    }
}










public class localinnercls2 {
    public static void main(String[] args) {
        fruit1 f=new fruit1();
        f.apple();
    }
}
