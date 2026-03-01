package laba1;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Возраст: ");
        int age = sc.nextInt();
        int birthYear = 2026 - age;
        System.out.println("Год рождения: " + birthYear);
        sc.close();
    }
}