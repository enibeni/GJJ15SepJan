package org.edu.gjj.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Alex
 * @since 30.09.14
 */
public class BrokenConcurency {
//    private static AtomicInteger i = new AtomicInteger(0);
    private static int i = 0;
    public static final int TIMES = 1000000;

    public synchronized static void increment() {
//        i.incrementAndGet();
        i++;
    }

    public static int intcrementInThreads(int numThreads) {
        List<Thread> threads = new ArrayList<Thread>();

        for (int j = 0; j < numThreads; j++) {
            Thread nth = new Thread(new IncrementNtimes());
            nth.start();
            threads.add(nth);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        return i.get();
        return i;
    }


    private static class IncrementNtimes implements Runnable {

        @Override
        public void run() {
            for (int j = 0; j < TIMES; j++) {
                increment();
            }
        }
    }

}
