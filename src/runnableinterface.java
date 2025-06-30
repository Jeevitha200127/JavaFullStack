
class a1 implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("thread1");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class b2 implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("thread2");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class runnableinterface {
    public static void main(String[] args) {


        Runnable a = new a1();
        Runnable b = new b2();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
