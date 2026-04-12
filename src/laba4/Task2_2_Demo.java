package laba4;
import java.util.Scanner;

public class Task2_2_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Введите номер столбца: ");
        int column = scanner.nextInt();

        System.out.println("Элементы столбца:");
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][column]);
        }
    }
}