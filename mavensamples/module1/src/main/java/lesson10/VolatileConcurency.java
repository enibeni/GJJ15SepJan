package org.edu.gjj.lesson10;

/**
 * @author Alex
 * @since 30.09.14
 */
public class VolatileConcurency {
    volatile static int a = 0;
    volatile static int b = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
               a = 1;
               b = 2;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(a + " " + b);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
