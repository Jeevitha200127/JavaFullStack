class c2 implements Runnable {
    public void run() {
        for (int i = 10; i <= 50; i = +10) {
            if (i == 50) {
                System.out.println("max water is filled");
            } else {
                System.out.println("filling..... ");
            }
            System.out.println(i + "% is filled");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
      public class watertank {
            public static void main(String[] args) throws InterruptedException {
                Runnable c = new c2();
                Thread t1 = new Thread(c);
                t1.start();
                Thread.sleep(2000);

            }
        }
