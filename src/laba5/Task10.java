package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static List<Integer> filterLessThan(List<Integer> list, int value) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num < value) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Введите количество чисел: ");
        int n = sc.nextInt();

        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Введите значение: ");
        int value = sc.nextInt();

        System.out.println("Подходящие числа: " + filterLessThan(list, value));
        sc.close();
    }
}