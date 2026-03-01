package laba1;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = sc.nextLine();
        System.out.print("Возраст: ");
        int age = sc.nextInt();
        System.out.print("Рост: ");
        float height = sc.nextFloat();
        System.out.println("Имя: " + name + " Возраст: " + age + "f, рост: " + height);
    }
}