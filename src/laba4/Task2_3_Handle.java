package laba4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_3_Handle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
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

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено неверное значение. Требуется число типа byte от -128 до 127.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e);
        } finally {
            System.out.println("Программа завершена.");
            scanner.close();
        }
    }
}