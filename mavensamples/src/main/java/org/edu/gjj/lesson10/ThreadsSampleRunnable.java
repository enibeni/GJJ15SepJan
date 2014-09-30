package org.edu.gjj.lesson10;

/**
 * @author Alex
 * @since 30.09.14
 */
public class ThreadsSampleRunnable {
    public static void main(String[] args) {
        Thread task1 = new Thread(new RunnableTask1());

        task1.start();
        System.out.println("Main thread runninng...");

        try {
            task1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished... isAlive:" + task1.isAlive());
    }

    public static class RunnableTask1 implements Runnable {
        @Override
        public void run() {
            System.out.println("Started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
        }
    }

}
