package Multithread;

import static java.lang.System.*;

public class trafficsignal extends Thread {
    public void run() {
        String red;
        String green;
        String yellow;
        for (int i = 0; i < 6; i++) {
            System.out.println("red stop");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class signal extends Thread {
    public void run() {
        String red;
        String green;
        String yellow;
        for (int i = 0; i < 6; i++) {
            System.out.println("green go");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class signal1 extends Thread {
    public void run() {
        String red;
        String green;
        String yellow;
        for (int i = 0; i < 6; i++) {
            System.out.println("yellow ready");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
        public static void main (String[]args){
            trafficsignal s = new trafficsignal();
            signal b1 = new signal();
            signal1 b2=new signal1();
            s.start();
            b1.start();
            b2.start();
        }
    }





