package timus;
import java.util.Scanner;

public class task_1787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int queue = 0;

        for (int i = 0; i < n; i++) {
            int arrived = sc.nextInt();

            queue += arrived;
            queue -= Math.min(queue, k);
        }

        System.out.println(queue);
        sc.close();
    }
}