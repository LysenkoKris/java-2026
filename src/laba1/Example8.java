package laba1;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("День недели: ");
        String dayOfWeek = sc.nextLine();
        System.out.print("Месяц: ");
        String month = sc.nextLine();
        System.out.print("Дата: ");
        int date = sc.nextInt();
        System.out.println("Сегодня: " + dayOfWeek + ", " + date + " " + month);
        sc.close();
    }
}
