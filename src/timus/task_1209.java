package timus;
import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long k = sc.nextLong();
            long d = 8L * k - 7;
            long s = (long) Math.sqrt(d);

            if (s * s == d && (s % 2 == 1)) {
                ans.append("1");
            } else {
                ans.append("0");
            }

            if (i + 1 < n) ans.append(" ");
        }

        System.out.println(ans);
    }
}