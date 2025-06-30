class ab{
    String name;
    int age;
    ab(String n, int a){
        name=n;
        age=a;

    }
    public void run(){
        System.out.println(name+" "+age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        ab a1=new ab("jee",2);
        a1.run();

    }

    }

