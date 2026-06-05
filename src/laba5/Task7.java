package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static List<String> filterByLength(List<String> list, int minLength) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s != null && s.length() > minLength) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите строки:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Введите минимальную длину: ");
        int minLength = sc.nextInt();

        System.out.println("Подходящие строки: " + filterByLength(list, minLength));
        sc.close();
    }
}