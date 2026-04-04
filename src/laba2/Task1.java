package laba2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 10; // можно поменять
        int[] array = new int[size];
        Random random = new Random();

        // заполнение и вывод массива
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // числа 0..99
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // поиск минимума
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        // вывод индексов минимальных элементов
        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы минимальных элементов: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}