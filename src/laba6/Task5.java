package laba6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task5 {
    public static int findMax(int[] arr) throws InterruptedException {
        int threadsCount = Runtime.getRuntime().availableProcessors();
        int chunk = (arr.length + threadsCount - 1) / threadsCount;

        int[] localMax = new int[threadsCount];
        Thread[] threads = new Thread[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            final int index = i;
            final int start = i * chunk;
            final int end = Math.min(arr.length, start + chunk);

            threads[i] = new Thread(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                localMax[index] = max;
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            if (t != null) t.join();
        }

        int max = Integer.MIN_VALUE;
        for (int x : localMax) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {5, 2, 9, 1, 7, 11, 3};
        System.out.println(findMax(arr));
    }
}