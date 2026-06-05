package timus;
import java.util.Scanner;

public class task_1581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        StringBuilder ans = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (i < n && a[i] == a[i - 1]) {
                count++;
            } else {
                ans.append(count).append(' ').append(a[i - 1]).append(' ');
                count = 1;
            }
        }

        System.out.println(ans.toString().trim());
        sc.close();
    }
}
