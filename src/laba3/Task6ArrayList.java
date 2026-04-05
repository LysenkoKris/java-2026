package laba3;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество людей N: ");
        int n = scanner.nextInt();

        ArrayList<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;

        long start = System.nanoTime();

        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        long end = System.nanoTime();

        System.out.println("Остался человек: " + people.get(0));
        System.out.println("Время ArrayList: " + (end - start) + " нс");
    }
}