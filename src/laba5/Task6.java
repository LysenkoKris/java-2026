package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static List<Integer> filterDivisible(List<Integer> list, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (divisor != 0 && num % divisor == 0) {
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

        System.out.print("Введите делитель: ");
        int divisor = sc.nextInt();

        System.out.println("Подходящие числа: " + filterDivisible(list, divisor));
        sc.close();
    }
}