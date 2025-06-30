class Person {
    String name = "vijay";
    int age =10;
}
class Dog{
    String name="pinky";
    String breed="gs";
    String colour="brown";
}
public class Obj{
    public static void main(String[] args) {
Person p=new Person();
Dog d=new Dog();
System.out.println("Dog name"+" "+d.name);
System.out.println("Dog breed"+" "+d.breed);
System.out.println("Dog colour"+" "+d.colour);
System.out.println("person age"+" "+p.age);
System.out.println("person name"+" "+p.name);

    }

}