package Multithread;

public class sleep extends Thread{
    public void run(){
        for(int i=0;i<6;i++) {
            System.out.println("java developer");
           try{
               Thread.sleep(1000);
           }
           catch (Exception e){
               System.out.println(e);
           }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("react developer");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        sleep s=new sleep();
        B b1=new B();
        s.start();
        b1.start();
    }
}
