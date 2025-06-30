class parent{
    void play(){
        System.out.println("good");
    }
}

class child extends parent{
    void play(){
        System.out.println("hi");
    }
    void eat(){
        System.out.println("thank you");
    }
}




public class Singleinheritance {
    public static void main(String[] args) {
child c=new child();
c.play();
c.eat();
    }
}
