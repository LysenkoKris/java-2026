package timus;
import java.util.Scanner;


public class task_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Math.max(1, n);
        int sum = max * (max + 1) / 2;

        if (n < 1) {
            sum -= (1 + Math.abs(n)) * Math.abs(n) / 2;
        }

        System.out.println(sum);
        sc.close();
    }
}
