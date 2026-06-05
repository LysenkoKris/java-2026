package laba6;

public class Task3 {
    private static final Object lock = new Object();
    private static int current = 1;

    static class OddThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (current <= 10 && current % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }

                    if (current > 10) {
                        lock.notifyAll();
                        return;
                    }

                    System.out.println("odd: " + current);
                    current++;
                    lock.notifyAll();
                }
            }
        }
    }

    static class EvenThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (current <= 10 && current % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }

                    if (current > 10) {
                        lock.notifyAll();
                        return;
                    }

                    System.out.println("even: " + current);
                    current++;
                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}