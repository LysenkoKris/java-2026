package timus;
import java.util.Scanner;

public class task_2056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        boolean hasThree = false;
        boolean allFive = true;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            sum += m;
            if (m == 3) {
                hasThree = true;
            }
            if (m != 5) {
                allFive = false;
            }
        }

        if (hasThree) {
            System.out.println("None");
        } else if (allFive) {
            System.out.println("Named");
        } else if ((double) sum / n >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }

        sc.close();
    }
}