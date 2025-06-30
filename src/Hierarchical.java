class Bike{
    void speak(){
        System.out.println("speaking");
    }
}
class Scooty extends Bike{
    void speak(){
        System.out.println("speaker");
    }
            void play(){
                System.out.println("playing");
            }
}
class Pulsar extends Bike{
    void speak(){
        System.out.println("spoke");
    }
    void read(){
        System.out.println("reading");
    }
}




public class Hierarchical {
    public static void main(String[] args) {
        Pulsar p=new Pulsar();
        p.speak();
        p.read();
    }
}
