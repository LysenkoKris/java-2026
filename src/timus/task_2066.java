package timus;
import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int minResult = Integer.MAX_VALUE;

        // Все 6 перестановок чисел
        int[][] perms = {
                {a, b, c},
                {a, c, b},
                {b, a, c},
                {b, c, a},
                {c, a, b},
                {c, b, a}
        };

        // Все 9 комбинаций операций (0=+, 1=-, 2=×)
        for (int[] perm : perms) {
            for (int op1 = 0; op1 < 3; op1++) {
                for (int op2 = 0; op2 < 3; op2++) {
                    int x = perm[0], y = perm[1], z = perm[2];

                    // Вычисляем выражение x op1 y op2 z с учетом приоритета ×
                    int result;
                    if (op1 == 2 && op2 == 2) {
                        // x × y × z
                        result = x * y * z;
                    } else if (op1 == 2) {
                        // (x × y) op2 z
                        int left = x * y;
                        result = calc(left, op2, z);
                    } else if (op2 == 2) {
                        // x op1 (y × z)
                        int right = y * z;
                        result = calc(x, op1, right);
                    } else {
                        // x op1 y op2 z слева направо
                        int left = calc(x, op1, y);
                        result = calc(left, op2, z);
                    }

                    if (result < minResult) {
                        minResult = result;
                    }
                }
            }
        }

        System.out.println(minResult);
        sc.close();
    }

    static int calc(int x, int op, int y) {
        switch (op) {
            case 0: return x + y;  // +
            case 1: return x - y;  // -
            case 2: return x * y;  // ×
            default: return 0;
        }
    }
}
