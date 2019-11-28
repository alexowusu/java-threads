package io.turntabl.myThreads;

public class TwoBThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()-> System.out.print("t"));
        t.start();
        System.out.println("hello from thread t");

       t.join();
        Thread.sleep(10000);

        Thread s = new Thread(()-> System.out.print("s"));
        s.start();
        System.out.println("hello from thread s");
        s.join();




    }
}
