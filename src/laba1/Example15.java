package laba1;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = sc.nextInt();
        System.out.print("Второе число: ");
        int b = sc.nextInt();
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        sc.close();
    }
}