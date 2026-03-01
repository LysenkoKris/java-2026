package timus;
import java.util.Scanner;

public class task_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N == 0) {
            System.out.println(10);
            return;
        }

        if (N == 1) {
            System.out.println(1);
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int d = 9; d >= 2; d--) {
            while (N % d == 0) {
                result.append(d);
                N /= d;
            }
        }

        if (N > 1) {
            System.out.println(-1);
        } else {
            System.out.println(result.reverse().toString());
        }

        sc.close();
    }
}
