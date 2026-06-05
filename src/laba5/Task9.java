package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static List<String> filterOnlyLetters(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s != null && s.matches("\\p{L}+")) {
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

        System.out.println("Только буквы: " + filterOnlyLetters(list));
        sc.close();
    }
}