package laba1;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = sc.nextInt();
        System.out.print("Второе число: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Сумма: " + sum);
        sc.close();
    }
}