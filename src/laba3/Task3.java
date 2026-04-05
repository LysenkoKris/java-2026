package laba3;
import java.util.Scanner;

public class Task3 {
    static Scanner sc = new Scanner(System.in);

    public static void input(int[] a, int i) {
        if (i < a.length) {
            a[i] = sc.nextInt();
            input(a, i + 1);
        }
    }

    public static void output(int[] a, int i) {
        if (i < a.length) {
            System.out.print(a[i] + " ");
            output(a, i + 1);
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        input(a, 0);
        output(a, 0);
    }
}