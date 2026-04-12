package laba4;
import java.util.Scanner;

public class Task2_3_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        byte[] array = new byte[n];

        System.out.println("Введите элементы массива типа byte:");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextByte();
        }

        byte sum = 0;

        for (int i = 0; i < n; i++) {
            int temp = sum + array[i];

            if (temp < Byte.MIN_VALUE || temp > Byte.MAX_VALUE) {
                throw new ArithmeticException("Сумма выходит за границы типа byte");
            }

            sum = (byte) temp;
        }

        System.out.println("Сумма элементов массива = " + sum);
    }
}