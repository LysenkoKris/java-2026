package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static List<String> filterCapitalized(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String s : list) {
            if (s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0))) {
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

        List<String> result = filterCapitalized(list);
        System.out.println("Строки с большой буквы: " + result);

        sc.close();
    }
}