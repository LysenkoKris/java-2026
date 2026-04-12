package laba4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_2_Handle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
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

            if (column < 0 || column >= cols) {
                throw new ArrayIndexOutOfBoundsException("Столбца с таким номером не существует");
            }

            System.out.println("Элементы столбца:");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][column]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число целого типа.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e);
        } finally {
            System.out.println("Программа завершена.");
            scanner.close();
        }
    }
}