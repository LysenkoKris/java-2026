package laba6;

public class Task4 {
    static class NumThread extends Thread {
        private final int num;

        public NumThread(int num) {
            super("Thread-" + num);
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println(getName() + ": " + num);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread t = new NumThread(i);
            t.start();
            t.join();
        }
    }
}