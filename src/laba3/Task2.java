package laba3;
import java.util.Scanner;

public class Task2 {
    public static void toBinary(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        }
        toBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toBinary(n);
    }
}