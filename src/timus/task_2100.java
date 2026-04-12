package timus;
import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int totalGuests = 2;

        for (int i = 0; i < n; i++) {
            String response = sc.nextLine();
            if (response.endsWith("+one")) {
                totalGuests += 2;
            } else {
                totalGuests += 1;
            }
        }

        if (totalGuests == 13) {
            totalGuests += 1;
        }

        System.out.println(totalGuests * 100);
        sc.close();
    }
}
