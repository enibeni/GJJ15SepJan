package org.edu.gjj.lesson10;

/**
 * @author Alex
 * @since 30.09.14
 */
public class ThreadsSample {
    public static void main(String[] args) {
        Task1 task1 =  new Task1();
        Task1 task2 =  new Task1();
        Task1 task3 =  new Task1();
        Task1 task4 =  new Task1();
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        System.out.println("Main thread runninng...");

        try {
            task1.join();
            task2.join();
            task3.join();
            task4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished... isAlive:" + task1.isAlive());



    }

    public static class Task1 extends Thread {
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
