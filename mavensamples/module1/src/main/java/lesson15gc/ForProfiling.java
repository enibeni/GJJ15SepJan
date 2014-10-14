package lesson15gc;

import java.util.List;
import java.util.Random;

/**
 * @author Alex
 * @since 12.10.14
 */
public class ForProfiling {


    public static void main(String[] args) {
        forever();
    }

    public static void forever() {
        Random r = new Random();
        for (;;) {
            int val = r.nextInt(2);
            switch (val) {
                case 0:
                    sleep1();
                    break;
                case 1:
                    sleep2();
                    break;
            }
        }
    }

    public static void sleep1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepInMillis(1);
    }

    public static void sleep2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepInMillis(5);
    }

    public static void sleepInMillis(int units) {
        try {
            Thread.sleep(100 * units);
            System.out.println("Sleeped" + units * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
