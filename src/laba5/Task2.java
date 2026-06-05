package laba5;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static int[] commonElements(int[] a, int[] b) {
        HashSet<Integer> setA = new HashSet<>();
        for (int x : a) {
            setA.add(x);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int x : b) {
            if (setA.contains(x)) {
                resultSet.add(x);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int x : resultSet) {
            result[i++] = x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер первого массива: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Введите элементы первого массива:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Введите размер второго массива: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Введите элементы второго массива:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = commonElements(a, b);

        System.out.print("Общие элементы: ");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}