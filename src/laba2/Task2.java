package laba2;

public class Task2 {
    public static void main(String[] args) {
        int rows = 9;
        int cols = 9;
        int[][] a = new int[rows][cols];

        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {                 // чётная строка: слева направо
                for (int j = 0; j < cols; j++) {
                    a[i][j] = value++;
                }
            } else {                          // нечётная строка: справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    a[i][j] = value++;
                }
            }
        }

        // вывод
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}
