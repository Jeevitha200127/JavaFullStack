class person1{
   private String name="jeevitha";
    private int age=10;

    public void setName(String name1) {
        name = name1;
    }
public void setAge(int age1){
        age=age1;
}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        person1 p=new person1();
p.setName("kavya");
p.setAge(20);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
