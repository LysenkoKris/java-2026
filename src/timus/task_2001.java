package timus;
import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), b1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt();
        int a3 = sc.nextInt(), b3 = sc.nextInt();

        System.out.println((a1 - a3) + " " + (b1 - b2));
        sc.close();
    }
}