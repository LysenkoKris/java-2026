package laba6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
            long end = System.currentTimeMillis() + 10_000;

            while (System.currentTimeMillis() < end) {
                System.out.println(getName() + " " + LocalTime.now().format(fmt));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("Thread-1");
        Thread t2 = new MyThread("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}