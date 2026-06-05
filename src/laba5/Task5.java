package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static List<String> filterBySubstring(List<String> list, String substring) {
        List<String> result = new ArrayList<>();

        for (String s : list) {
            if (s != null && s.contains(substring)) {
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

        System.out.print("Введите подстроку: ");
        String substring = sc.nextLine();

        List<String> result = filterBySubstring(list, substring);
        System.out.println("Подходящие строки: " + result);

        sc.close();
    }
}