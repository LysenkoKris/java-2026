package laba1;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Фамилия: ");
        String surname = sc.nextLine();
        System.out.print("Имя: ");
        String name = sc.nextLine();
        System.out.print("Отчество: ");
        String patronymic = sc.nextLine();
        System.out.println("Hello " + surname + " " + name + " " + patronymic);
        sc.close();
    }
}