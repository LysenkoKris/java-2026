package laba1;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = sc.nextLine();
        System.out.print("Возраст: ");
        int age = sc.nextInt();
        System.out.println("Имя пользователя: " + name + ", возраст: " + age);
        sc.close();
    }
}