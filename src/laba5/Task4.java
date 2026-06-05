package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static List<Integer> squareNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (Integer x : list) {
            result.add(x * x);
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

        List<Integer> result = squareNumbers(list);
        System.out.println("Квадраты чисел: " + result);

        sc.close();
    }
}