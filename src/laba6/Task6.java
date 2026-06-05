package laba6;

public class Task6 {
    public static long sum(int[] arr) throws InterruptedException {
        int threadsCount = Runtime.getRuntime().availableProcessors();
        int chunk = (arr.length + threadsCount - 1) / threadsCount;

        long[] partial = new long[threadsCount];
        Thread[] threads = new Thread[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            final int index = i;
            final int start = i * chunk;
            final int end = Math.min(arr.length, start + chunk);

            threads[i] = new Thread(() -> {
                long s = 0;
                for (int j = start; j < end; j++) {
                    s += arr[j];
                }
                partial[index] = s;
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            if (t != null) t.join();
        }

        long total = 0;
        for (long x : partial) {
            total += x;
        }
        return total;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {5, 2, 9, 1, 7, 11, 3};
        System.out.println(sum(arr));
    }
}