package lesson10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Alex
 * @since 03.10.14
 */
public class ExecutorTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            final int ifinal = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                        System.out.println(ifinal + "finished");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



}
