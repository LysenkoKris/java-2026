package laba5;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static int[] getEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] even = getEvenNumbers(arr);
        System.out.println("Четные числа: " + Arrays.toString(even));

        sc.close();
    }
}