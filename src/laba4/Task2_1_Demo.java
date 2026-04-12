package laba4;
import java.util.Scanner;

public class Task2_1_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int value : array) {
            if (value > 0) {
                sum += value;
                count++;
            }
        }

        if (count == 0) {
            throw new ArithmeticException("Положительные элементы отсутствуют");
        }

        double average = (double) sum / count;
        System.out.println("Среднее значение положительных элементов = " + average);
    }
}