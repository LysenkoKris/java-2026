package timus;
import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int remaining = 12 - f;
        int timeLeft = 4 * 60;
        if (remaining * 45 <= timeLeft) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
