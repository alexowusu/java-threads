package io.turntabl.myThreads;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoreThread {
    public static void main(String[] args) throws InterruptedException {
       List <Thread> t =  IntStream.range(0, 9).mapToObj(i->new Thread(()->{

       while (!Thread.interrupted()){}
       System.err.println("Thread"+i +"interrupted");
       }))
               .collect(Collectors.toList());
        System.out.println(t.size());
        t.forEach(Thread::start);

        System.out.println("running threads " + Thread.activeCount());
        Random any = new Random();
        while (Thread.activeCount()!=1){Thread.sleep(10000);
        t.get(any.nextInt(9)).interrupt();
        }
    }
}







//        t.join();
//        Thread.sleep(10000);
//
//        Thread s = new Thread(()-> System.out.print("s"));
//        s.start();
//        System.out.println("hello from thread s");
//
//
//
//
//        t.start();
//        s.join();

