package timus;
import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // количество панелей
        int A = sc.nextInt();  // ширина панели (м)
        int B = sc.nextInt();  // длина панели (м)

        // Площадь одной панели с двух сторон: 2 * A * B
        // Всего сульфида: N * 2 * A * B * 1 нг/м²
        long totalSulfide = (long) N * 2 * A * B;

        System.out.println(totalSulfide);

        sc.close();
    }
}
