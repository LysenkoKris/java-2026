package timus;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int garry = sc.nextInt();
        int larry = sc.nextInt();

        int total = garry + larry - 1;

        int harryMissed = total - garry;
        int larryMissed = total - larry;
        System.out.println(harryMissed + " " + larryMissed);

        sc.close();
    }
}
