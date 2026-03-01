package laba1;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Год рождения: ");
        int birthYear = sc.nextInt();
        int age = 2026 - birthYear;
        System.out.println("Ваш возраст: " + age);
        sc.close();
    }
}
