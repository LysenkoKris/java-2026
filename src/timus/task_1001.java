package timus;

import java.util.Scanner;
import java.util.ArrayList;

public class task_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        while (sc.hasNext()) {
            if (sc.hasNextLong()) {
                numbers.add(sc.nextLong());
            } else {
                sc.next();
            }
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            double sqrt = Math.sqrt(numbers.get(i));
            System.out.printf("%.4f%n", sqrt);
        }

        sc.close();
    }
}