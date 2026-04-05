package laba3;

public class Task1 {
    private static int step = 0;

    public static void example1(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            example1(2 * x + 1);
        }
    }

    public static void example2(int x) {
        if ((2 * x + 1) < 20) {
            example2(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    public static void example3(int x) {
        space();
        System.out.println(x + " ->");
        step++;
        if ((2 * x + 1) < 20) {
            example3(2 * x + 1);
        }
        step--;
        space();
        System.out.println(x + " <-");
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void printFibTree(int n, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println("fib(" + n + ")");
        if (n > 1) {
            printFibTree(n - 2, level + 1);
            printFibTree(n - 1, level + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Пример 1");
        example1(1);

        System.out.println();
        System.out.println("Пример 2");
        example2(1);

        System.out.println();
        System.out.println("Пример 3");
        example3(1);

        System.out.println();
        System.out.println("Пример 4");
        System.out.println(factorial(5));

        System.out.println();
        System.out.println("Пример 5");
        System.out.println(fibonacci(5));

        System.out.println();
        System.out.println("Дерево рекурсивных вызовов Fibonacci");
        printFibTree(5, 0);
    }
}