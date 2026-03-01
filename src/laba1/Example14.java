package laba1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Число: ");
        int n = sc.nextInt();
        int n1 = n - 1;
        int n2 = n;
        int n3 = n + 1;
        int n4 = (n1 + n2 + n3) * (n1 + n2 + n3);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
        sc.close();
    }
}