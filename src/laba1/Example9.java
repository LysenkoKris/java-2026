package laba1;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Название месяца: ");
        String month = sc.nextLine();
        System.out.print("Количество дней: ");
        int days = sc.nextInt();
        System.out.println(month + " содержит " + days + " дней");
        sc.close();
    }
}